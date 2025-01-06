package by.web3.hyperspace.domain;

import java.io.Serializable;

public class ErrMsg implements Serializable {
    private int statusCode;
    private String message;

    public ErrMsg() {
    }

    public ErrMsg(int statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public ErrMsg setStatusCode(int status) {
        this.statusCode = status;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public ErrMsg setMessage(String message) {
        this.message = message;
        return this;
    }
}
