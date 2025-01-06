package by.web3.hyperspace.domain.model;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class ReqResp {
    private String id;
    private String modelID;
    private String prompt;
    private Params params;
    private Status status;
    private String userPK;
    private long createdAt;
    private String result;
    private String nodePK;
    private long completedAt;
    private String registrationID;
    private TokenStats tokenStats;
    private String error;
    private String errorMessage;

    public enum Status {
        PENDING,
        ACK,
        FAILED,
        COMPLETED
    }

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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
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

    public long getCreatedAt() {return createdAt;}

    public void setCreatedAt(long createdAt) {this.createdAt = createdAt;}

    public long getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(long completedAt) {
        this.completedAt = completedAt;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
