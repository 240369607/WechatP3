package com.zjj.wechat3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import com.zjj.wechat3.domain.InMessage;

@SpringBootApplication
public class Wechat3Application {

	// 相当于Spring的XML配置方式中的<bean>元素
		@Bean
		public RedisTemplate<String, InMessage> inMessageTemplate(//
				@Autowired RedisConnectionFactory redisConnectionFactory) {
			RedisTemplate<String, InMessage> template = new RedisTemplate<>();
			template.setConnectionFactory(redisConnectionFactory);
			return template;
		}

		public static void main(String[] args) {
			SpringApplication.run(Wechat3Application.class, args);
		}

}
