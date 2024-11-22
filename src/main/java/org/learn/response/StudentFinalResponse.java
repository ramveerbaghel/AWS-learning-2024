package org.learn.response;

import org.learn.common.MessageInfo;

public class StudentFinalResponse {
    private String header;
    private String payload;
    private MessageInfo msg;

    @Override
    public String toString() {
        return "StudentFinalResponse{" +
                "header='" + header + '\'' +
                ", payload='" + payload + '\'' +
                ", msg=" + msg +
                '}';
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public MessageInfo getMsg() {
        return msg;
    }

    public void setMsg(MessageInfo msg) {
        this.msg = msg;
    }
}
