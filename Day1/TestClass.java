package redis_test;

import java.util.Set;

import redis.clients.jedis.Jedis;

public class TestClass {

	public static void main(String[] args) {
		Jedis jedis = new Jedis("redis://localhost:6379");
//		System.out.println("Connection Successful!");
//		System.out.println(jedis.ping());
		try {
//			String key1 = "Shankar";
//			jedis.lpush(key1, "Btech");
//			jedis.lpush(key1, "BE");
//			jedis.lpush(key1, "M.Com");
//			jedis.lpush(key1, "PhD");
//			jedis.lpush(key1, "MBBS");
//			
//			USING lpush RETURN DUPLICATE VALUES ON BEING CALLED ON BY
//			lrange(). Therefore, using sadd()
//			
//			System.out.println(jedis.lrange(key1, 0,-1));

//			String key1 = "Shankar";
//			String[] val = { "Btech", "BE", "M.Com", "PhD", "MBBS" };
//			for (String s : val) {
//
//				jedis.sadd(key1, s);
//			}
//			Set<String> setValues = jedis.smembers(key1);
//			for (String s : setValues) {
//				System.out.println(s);
//			}

			String key = "Shashwat";
			String[] values = { "Btech", "23", "Malasi" };
			jedis.sadd(key, values);

			Set<String> value = jedis.smembers(key);
			for (String v : value) {
				System.out.println(v);
			}
		} finally {
			jedis.close();
		}

	}

}
