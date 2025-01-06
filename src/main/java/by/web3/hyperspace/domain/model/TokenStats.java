package by.web3.hyperspace.domain.model;

public class TokenStats {
    private int prompt;
    private int promptTime;
    private int result;
    private int resultTime;

    public int getPrompt() {
        return prompt;
    }

    public void setPrompt(int prompt) {
        this.prompt = prompt;
    }

    public int getPromptTime() {
        return promptTime;
    }

    public void setPromptTime(int promptTime) {
        this.promptTime = promptTime;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int getResultTime() {
        return resultTime;
    }

    public void setResultTime(int resultTime) {
        this.resultTime = resultTime;
    }
}
