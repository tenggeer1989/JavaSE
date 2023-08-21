package com.tge.qq;

/**
 * ClassName: com.tge.qq.MessageType
 * Package: com.tge.qq
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/18 - 22:47
 * Version:
 */
public interface MessageType {
    String MESSAGE_LOGIN_SUCCEED = "1";//登录成功
    String MESSAGE_LOGIN_FAIL = "2";//登录失败
    String MESSAGE_COMM_MES = "3";//普通信息包
    String MESSAGE_GET_ONLINE_FRIEND = "4";//要求返回在线用户数
    String MESSAGE_RET_ONLINE_FRIEND = "5";//返回在线用户列表
    String MESSAGE_CLIENT_EXIT = "6";//客户端请求退出
    String MESSAGE_TOALL_MES = "7";//群聊消息
    String MESSAGE_FILE_MES = "8";//群聊消息

}
