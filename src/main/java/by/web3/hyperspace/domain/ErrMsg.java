package by.web3.hyperspace.domain;

import java.io.Serializable;

public class ErrMsg implements Serializable {
    private int status;
    private String message;

    public ErrMsg() {
    }

    public ErrMsg(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public ErrMsg setStatus(int status) {
        this.status = status;
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
