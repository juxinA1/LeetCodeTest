package com.LeetCode.solution0028.test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.LeetCode.solution0028.Solution0028;

public class Solution0028Test {
	
	@Test
	public void strStrTest_001() {
		
		// 实际值
		int result = getResult("", "");
		// 比较结果
		Assert.assertEquals(-1, result);
	}
	
	@Test
	public void strStrTest_002() {
		
		// 实际值
		int result = getResult("aaa", "");
		// 比较结果
		Assert.assertEquals(0, result);
	}
	
	@Test
	public void strStrTest_003() {
		
		// 实际值
		int result = getResult("", "aa");
		// 比较结果
		Assert.assertEquals(-1, result);
	}
	
	@Test
	public void strStrTest_004() {
		
		// 实际值
		int result = getResult("aaa", "aab");
		// 比较结果
		Assert.assertEquals(0, result);
	}
	
	@Test
	public void strStrTest_005() {
		
		// 实际值
		int result = getResult("hello", "ll");
		// 比较结果
		Assert.assertEquals(0, result);
	}
	
	@Test
	public void strStrTest_006() {
		
		// 实际值
		int result = getResult("aaaaa", "bba");
		// 比较结果
		Assert.assertEquals(0, result);
	}
	
	/* 
	 * 返回实际值
	 */
	private int getResult (String haystack, String needle ) {
		Solution0028 test28 = new Solution0028();
		return test28.strStr(haystack, needle);
	}
}
