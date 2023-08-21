package com.tge.qq;

import java.io.Serializable;

/**
 * ClassName: Message
 * Package: com.tge.qq
 * Description:客户端和服务端通信时的消息对象
 *
 * @Author: tge
 * @Create: 2023/8/18 - 22:38
 * Version:
 */
public class Message implements Serializable {
    private static final long serialVersionUID = 1221015556669564663L;
    private String sender;//发送者
    private String receiver;//接收者
    private String content;//发送内容
    private String sendTime;//发送时间
    private String msgType;//消息类型


    // 进行扩展 和文件相关的成员
    private byte[] fileBytes;
    private int fileLen = 0;
    private String dest;
    private String src;

    public Message(){

    }

    public Message(String sender, String receiver, String content, String sendTime, String msgType) {
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
        this.sendTime = sendTime;
        this.msgType = msgType;
    }

    public byte[] getFileBytes() {
        return fileBytes;
    }

    public void setFileBytes(byte[] fileBytes) {
        this.fileBytes = fileBytes;
    }

    public int getFileLen() {
        return fileLen;
    }

    public void setFileLen(int fileLen) {
        this.fileLen = fileLen;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }
}
