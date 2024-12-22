package by.web3.hyperspace.controller;

import by.web3.hyperspace.domain.model.Model;
import by.web3.hyperspace.domain.model.ModelContainer;
import by.web3.hyperspace.domain.model.ModelResponse;
import by.web3.hyperspace.service.HttpClient;
import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.List;

@Controller
public class InitController {
    private final String GENERAL_PAGE = "https://node.hyper.space/";
    private final String ALLOWED_MODELS = "https://api.hive.aios.network/v1/models/live?skip=0&take=10";
    @GetMapping("/init")
    public String init(){
        return "ads";
    }

    private List<Model> getMdelList(){
        var client = new HttpClient();
        var json = client.get(ALLOWED_MODELS, new HashMap<>());
        var gson = new Gson();
        var result = gson.fromJson(json, ModelResponse.class);
        return result.getModels().stream().map(ModelContainer::getModel).toList();
    }
}
