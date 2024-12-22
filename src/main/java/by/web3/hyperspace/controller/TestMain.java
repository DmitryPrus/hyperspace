package by.web3.hyperspace.controller;

import by.web3.hyperspace.domain.model.ModelResponse;
import com.google.gson.*;

import java.io.IOException;
import java.util.HashMap;

import by.web3.hyperspace.service.HttpClient;

public class TestMain {

    final static String ALLOWED_MODELS = "https://api.hive.aios.network/v1/models/live?skip=0&take=10";

    public static void main(String[] args) throws IOException {
//        System.setProperty("webdriver.edge.driver", "src/main/resources/msedgedriver.exe");
//
//        WebDriver driver = new EdgeDriver();
//
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

        var client = new HttpClient();
        var json = client.get(ALLOWED_MODELS, new HashMap<>());
        var gson = new Gson();
        var result = gson.fromJson(json, ModelResponse.class);

        System.out.println("done");
    }
}
