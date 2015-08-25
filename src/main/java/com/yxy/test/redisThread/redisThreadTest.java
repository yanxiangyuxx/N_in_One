package com.yxy.test.redisThread;

import redis.clients.jedis.Jedis;

/**
 * Created by syyanxiangyu on 2015/7/31.
 */
public class redisThreadTest {
    public static void main(String[] args){
        ReadRedis readRedis = new ReadRedis();
        Thread thread1= new Thread(readRedis);
        Thread thread2= new Thread(readRedis);

        thread1.start();
        thread2.start();

//        Jedis jedis = new Jedis("172.24.7.103", 6379);
//        jedis.set("key","value");
    }
}

class ReadRedis implements Runnable{
    Jedis jedis = new Jedis("172.24.7.103", 6379);


    public  int i = 0;
    @Override
    public void run() {

        while(i<1000){

            try {
                jedis.incrBy("aaa",  i++);
                System.out.println(Thread.currentThread().getName()+i);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

