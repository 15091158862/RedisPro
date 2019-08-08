package com.yangyi.redis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yangyi.redis.util.single.RedisUtil;

@RestController
@RequestMapping("/test")
public class TestController {
	@Autowired
	private RedisUtil redis;

	@PostMapping("/aaa")
	public void aaa() {
		redis.set("aaa", "1111-value");
		System.out.println(redis.incr("incre", 1));
		System.out.println(redis.incr("incre", 10));
		System.out.println(redis.incr("incre", 100));
		System.out.println(redis.get("aaa"));
	}
}
