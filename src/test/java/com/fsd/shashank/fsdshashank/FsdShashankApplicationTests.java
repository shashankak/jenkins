package com.fsd.shashank.fsdshashank;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import javax.validation.constraints.AssertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FsdShashankApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void testTestCase1() {
		Assert.isTrue(true);
	}

	@Test
	public void testTestCase2() {
		Assert.isTrue(true);
	}

	@Test
	public void testTestCase3() {
		Assert.isTrue(true);
	}

}
