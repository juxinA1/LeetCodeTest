package com.LeetCode.solution0941.test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.LeetCode.solution1694.Solution1694;

public class Solution1694Test {

	@Test
	public void reformatNumberTest_001() {

		// 预想值
		String expct = "123-456";
		// 实际值
		Solution1694 test = new Solution1694();
		String result = test.reformatNumber("1-23-45 6");
		// 比较结果
		Assert.assertEquals(expct, result);
	}
	
	@Test
	public void reformatNumberTest_002() {

		// 预想值
		String expct = "123-45-67";
		// 实际值
		Solution1694 test = new Solution1694();
		String result = test.reformatNumber("123 4-567");
		// 比较结果
		Assert.assertEquals(expct, result);
	}
	
	@Test
	public void reformatNumberTest_003() {

		// 预想值
		String expct = "123-456-78";
		// 实际值
		Solution1694 test = new Solution1694();
		String result = test.reformatNumber("123 4-5678");
		// 比较结果
		Assert.assertEquals(expct, result);
	}
	
	@Test
	public void reformatNumberTest_004() {

		// 预想值
		String expct = "175-229-353-94-75";
		// 实际值
		Solution1694 test = new Solution1694();
		String result = test.reformatNumber("--17-5 229 35-39475 ");
		// 比较结果
		Assert.assertEquals(expct, result);
	}

}
