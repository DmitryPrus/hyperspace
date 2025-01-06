package by.web3.hyperspace.domain.model;

import java.time.OffsetDateTime;

public class ReqResp {
    private String id;
    private String modelID;
    private String prompt;
    private Params params;
    private String status;
    private String userPK;
    private OffsetDateTime createdAt;
    private String result;
    private String nodePK;
    private long completedAt;
    private String registrationID;
    private TokenStats tokenStats;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModelID() {
        return modelID;
    }

    public void setModelID(String modelID) {
        this.modelID = modelID;
    }

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public Params getParams() {
        return params;
    }

    public void setParams(Params params) {
        this.params = params;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUserPK() {
        return userPK;
    }

    public void setUserPK(String userPK) {
        this.userPK = userPK;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getNodePK() {
        return nodePK;
    }

    public void setNodePK(String nodePK) {
        this.nodePK = nodePK;
    }

    public long getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(long completedAt) {
        this.completedAt = completedAt;
    }

    public String getRegistrationID() {
        return registrationID;
    }

    public void setRegistrationID(String registrationID) {
        this.registrationID = registrationID;
    }

    public TokenStats getTokenStats() {
        return tokenStats;
    }

    public void setTokenStats(TokenStats tokenStats) {
        this.tokenStats = tokenStats;
    }
}
