package by.web3.hyperspace.domain.model;


public class ModelContainer {
    private Model model;
    private Integer availableNodes;
    private Integer activeNodes;

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Integer getAvailableNodes() {return availableNodes;}

    public void setAvailableNodes(Integer availableNodes) {this.availableNodes = availableNodes;}

    public Integer getActiveNodes() {return activeNodes;}

    public void setActiveNodes(Integer activeNodes) {
        this.activeNodes = activeNodes;
    }
}
