package by.web3.hyperspace.controller;

import by.web3.hyperspace.domain.ErrMsg;
import by.web3.hyperspace.domain.model.Model;
import by.web3.hyperspace.domain.model.ModelContainer;
import by.web3.hyperspace.domain.model.ModelResponse;
import by.web3.hyperspace.domain.model.ReqResp;
import com.google.gson.*;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

import by.web3.hyperspace.service.HttpClient;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestMain {

    final static String ALLOWED_MODELS = "https://api.hive.aios.network/v1/models/live?skip=0";
    final static String PROMPT = "Request 7. What is time now ?";
    final static String X_AIOS_NECTAR = "7R3H4EmXeyy19Fm3jT1GB39ihxT46FAKJ1cbrwb2QdFkwPee9AeEe3ymG8EqCYqNH8yucqTZCnCHTRDQYQ";
    final static String REQUST_POST_URL = "https://api.hive.aios.network/v1/inference";

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 5; i++) {
            var random = new Random();
            var models = getAvailableModelList();
            var model = models.get(random.nextInt(models.size()));
            var prompt = String.format("Request %d, What is AI?", i + 1);
            var req = postRequest(model.getId(), prompt, X_AIOS_NECTAR);
            if (req.getStatus() != ReqResp.Status.FAILED) req = getRequest(req.getId());
            while (req.getStatus() == ReqResp.Status.PENDING) {
                Thread.sleep(60000);
                req = getRequest(req.getId());
                System.out.printf("Request with ID %s is pending.%n", req.getId());
            }
            if (req.getStatus() == ReqResp.Status.FAILED) {
                System.out.printf("Request failed. Body: %s. Reason: %s%n", prompt, req.getErrorMessage());
                continue;
            }
            if (req.getStatus() == ReqResp.Status.COMPLETED) {
                var duration = (req.getCompletedAt() - req.getCreatedAt()) / 1000;
                System.out.printf("Request %s completed successfully for %d sec", req.getId(), duration);
            } else {
                System.out.printf("Something went wrong with request %s", req.getId());
            }
        }
    }

    public static ReqResp postRequest(String modelId, String prompt, String XaiOsNectar) {
        var client = new HttpClient();
        var headers = new HashMap<String, String>();
        headers.put("x-aios-nectar", XaiOsNectar);
        var body = String.format("{\"modelID\":\"%s\",\"prompt\":\"%s\"}", modelId, prompt);
        var json = client.post(REQUST_POST_URL, body, headers);
        var gson = new Gson();
        var result = gson.fromJson(json, ReqResp.class);
        if (result.getId() == null) {
            result.setErrorMessage(gson.fromJson(json, ErrMsg.class).getMessage());
            result.setStatus(ReqResp.Status.FAILED);
        }
        return result;
    }

    public static ReqResp getRequest(String requestId) {
        var client = new HttpClient();
        var json = client.get(REQUST_POST_URL + "/" + requestId, new HashMap<>());
        var gson = new Gson();
        return gson.fromJson(json, ReqResp.class);
    }

    public static List<Model> getAvailableModelList() {
        var client = new HttpClient();
        var json = client.get(ALLOWED_MODELS, new HashMap<>());
        var gson = new Gson();
        var result = gson.fromJson(json, ModelResponse.class);
        return result.getModels()
                .stream()
                .filter(m -> m.getAvailableNodes() > 0 && m.getActiveNodes() > 0)
                .map(ModelContainer::getModel)
                .toList();
    }

    public static void unusedMethod() {
        System.setProperty("webdriver.edge.driver", "src/main/resources/msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

//        try {
//            String url = "https://node.hyper.space";
//            driver.get(url);
//
//            String pageSource = driver.getPageSource();
//
//            System.out.println(pageSource);
//        } finally {
//            // Закрываем браузер
//            driver.quit();
//        }
    }
}
