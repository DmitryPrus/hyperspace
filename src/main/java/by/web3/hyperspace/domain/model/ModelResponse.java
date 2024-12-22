package by.web3.hyperspace.domain.model;

import java.util.List;

public class ModelResponse {
    private List<ModelContainer> models;

    public List<ModelContainer> getModels() {
        return models;
    }

    public void setModels(List<ModelContainer> models) {
        this.models = models;
    }
}
