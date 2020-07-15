package com.redis;

import redis.clients.jedis.Jedis;

public class redisDemo01 {
    public static void main(String[] args) {
        //获取连接
        Jedis jedis = new Jedis("localhost",6379);
        //操作
        jedis.set("name","nihao");
        //关闭资源
        jedis.close();
    }
}
