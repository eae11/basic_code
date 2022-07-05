package jedis;

import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
import utils.JedisPoolUtils;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class JedisTest {
    @org.junit.jupiter.api.Test
    public void test1() {
        //1.获取连接
        Jedis jedis = new Jedis("localhost", 6379);
        //2.操作
        jedis.set("username", "zhangsan");
        //3.关闭连接
        jedis.close();
    }

    @Test
    public void test2() {
        //1.获取连接
        Jedis jedis = new Jedis("localhost", 6379);//如果使用空参构造，默认值"localhost",6379端口
        //2.操作
        //存储
        jedis.set("username", "zhangsan");
        //获取
        String username = jedis.get("username");
        System.out.println(username);
        //可以使用setex()方法存储可以指定过期时间的key value
        jedis.setex("activecode", 30, "hh");//将键值对存入redis,并且20秒后自动删除该键值对

        //3.关闭连接
        jedis.close();
    }

    @Test
    public void test3() {
        //1.获取连接
        Jedis jedis = new Jedis("localhost", 6379);//如果使用空参构造，默认值"localhost",6379端口
        //2.操作
        //存储
        jedis.hset("user", "name", "lisi");
        jedis.hset("user", "age", "23");
        jedis.hset("user", "gender", "男");
        //获取
        String name = jedis.hget("user", "name");
        System.out.println(name);
        Map<String, String> user = jedis.hgetAll("user");
        Set<String> keySet = user.keySet();
        for (String key : keySet) {
            System.out.println(key + ":" + user.get(key));
        }
//        System.out.println(username);
        //3.关闭连接
        jedis.close();
    }

    @Test
    public void test4() {
        //1.获取连接
        Jedis jedis = new Jedis("localhost", 6379);//如果使用空参构造，默认值"localhost",6379端口
        //2.操作
        //list 存储
        jedis.lpush("mylist", "a", "b", "c");
        jedis.rpush("mylist", "a", "b", "c");
        //list 范围获取
        List<String> mylist = jedis.lrange("mylist", 0, -1);
        System.out.println(mylist);
        //list弹出
        String e1 = jedis.lpop("mylist");
        System.out.println(e1);
        String e2 = jedis.rpop("mylist");
        System.out.println(e2);
        //list 范围获取
        List<String> mylist2 = jedis.lrange("mylist", 0, -1);
        System.out.println(mylist2);
        //3.关闭连接
        jedis.close();
    }

    @Test
    public void test5() {
        //1.获取连接
        Jedis jedis = new Jedis("localhost", 6379);//如果使用空参构造，默认值"localhost",6379端口
        //2.操作
        //set存储
        jedis.sadd("myset", "java", "php", "c++");
        //set获取
        Set<String> myset = jedis.smembers("myset");
        System.out.println(myset);
        //3.关闭连接
        jedis.close();
    }

    @Test
    public void test6() {
        //1.获取连接
        Jedis jedis = new Jedis("localhost", 6379);//如果使用空参构造，默认值"localhost",6379端口
        //2.操作
        //sortedset存储
        jedis.zadd("mysortedset", 3, "盖伦");
        jedis.zadd("mysortedset", 30, "艾希");
        jedis.zadd("mysortedset", 60, "蛮王");

        //sortedset 获取
        Set<String> mysortedset = jedis.zrange("mysortedset", 0, -1);
        System.out.println(mysortedset);

        //3.关闭连接
        jedis.close();
    }

    @Test
    public void test7() {
        //0.创建一个配置对象
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(50);
        config.setMaxIdle(10);
        //1.创建Jedis连接池对象
        JedisPool jedisPool = new JedisPool(config, "localhost", 6379);
        //2.获取连接
        Jedis jedis = jedisPool.getResource();
        jedis.set("mystring", "hh");
        //3.关闭连接
        jedis.close();
    }

    @Test
    public void test8() {
        Jedis jedis = JedisPoolUtils.getJedis();
        jedis.set("mystring", "hh");
        //3.关闭连接
        jedis.close();
    }
}
