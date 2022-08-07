package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void demoTest() {
		Assert.isTrue(true, "Good");
	}

	@Test
	void demoTest_bad() {
		Assert.isTrue(false, "Good");
	}

}
