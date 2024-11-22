package org.learn.common;

public class MessageInfo {
    private String msgCode;
    private String msgStatus;
    private String msgDescription;

    public String getMsgCode() {
        return msgCode;
    }

    public String getMsgStatus() {
        return msgStatus;
    }

    public String getMsgDescription() {
        return msgDescription;
    }

    public void setMsgCode(String msgCode) {
        this.msgCode = msgCode;
    }

    public void setMsgStatus(String msgStatus) {
        this.msgStatus = msgStatus;
    }

    public void setMsgDescription(String msgDescription) {
        this.msgDescription = msgDescription;
    }

    @Override
    public String toString() {
        return "MessageInfo{" +
                "msgCode='" + msgCode + '\'' +
                ", msgStatus='" + msgStatus + '\'' +
                ", msgDescription='" + msgDescription + '\'' +
                '}';
    }

    public MessageInfo(String msgCode, String msgStatus, String msgDescription) {
        this.msgCode = msgCode;
        this.msgStatus = msgStatus;
        this.msgDescription = msgDescription;
    }

    public MessageInfo() {
    }
}
