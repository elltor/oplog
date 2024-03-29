package com.elltor.example.config.functions;

public class CustomFunctions {

    static String isAdmin(Integer uid) {
        if (uid == null) {
            return "false";
        }
        return uid % 2 == 0 ? "true" : "false";
    }

    static String userDetail(String username) {
        return username + " 男" + " 18";
    }

    static String orderDetail(Long id) {
        return "【 id : " + id + "订单名称：男士卫衣一件 地址：北京市海淀区 】";
    }


}
