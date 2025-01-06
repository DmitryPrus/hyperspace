package by.web3.hyperspace.domain.model;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class ReqResp {
    private String id;
    private String modelID;
    private String prompt;
    private Params params;
    private String status;
    private String userPK;
    private LocalDateTime createdAt;
    private String result;
    private String nodePK;
    private LocalDateTime completedAt;
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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = LocalDateTime.ofEpochSecond(
                createdAt / 1000,
                0,
                ZoneOffset.UTC
        );
    }

    public LocalDateTime getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(long completedAt) {
        this.completedAt = LocalDateTime.ofEpochSecond(
                completedAt / 1000,
                0,
                ZoneOffset.UTC // Указываем временную зону
        );
    }
}
