package cn.xhsy52.redis;

import org.junit.Test;
import redis.clients.jedis.Jedis;

/**
 * jedis的测试类
 */
public class redisTest {

    /**
     * 快速入门
     */
    @Test
    public void test1(){
        //1.获取链接
        Jedis jedis=new Jedis("localhost",6379);
        //2.操作
        jedis.set("username","xiaoxin");
        //3.关闭连接
        jedis.close();
    }

}
