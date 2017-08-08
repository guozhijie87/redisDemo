package com.guo.service.impl;

import redis.clients.jedis.Jedis;

/**
 * Created by jack on 2017/7/13.
 */
public class Redis {
    String host = "192.168.1.100";
    int port = 6379;
    Jedis client = new Jedis(host, port);

    // 执行set指令
    String result = client.set("key-string", "Hello, Redis!");

    public static void main(String args[]){
        Redis redis=new Redis();
        String a= redis.client.get("key-string");
        int b=0;
    }
}
