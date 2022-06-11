package com.LeetCode.solution0468.test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.LeetCode.solution0468.Solution0468;

public class Solution0468Test {
	
	@Test
	public void strStrTest_001() {
		
		// 实际值
		String result = getResult("172.16.254.1");
		// 比较结果
		Assert.assertEquals("IPv4", result);
	}
	
	@Test
	public void strStrTest_002() {
		
		// 实际值
		String result = getResult("192.168.1.0");
		// 比较结果
		Assert.assertEquals("IPv4", result);
	}
	
	@Test
	public void strStrTest_003() {
		
		// 实际值
		String result = getResult("192.168.01.1");
		// 比较结果
		Assert.assertEquals("Neither", result);
	}
	
	@Test
	public void strStrTest_004() {
		
		// 实际值
		String result = getResult("192.168.1.00");
		// 比较结果
		Assert.assertEquals("Neither", result);
	}
	
	@Test
	public void strStrTest_005() {
		
		// 实际值
		String result = getResult("192.168@1.1");
		// 比较结果
		Assert.assertEquals("Neither", result);
	}
	
	@Test
	public void strStrTest_006() {
		
		// 实际值
		String result = getResult("256.256.256.256");
		// 比较结果
		Assert.assertEquals("Neither", result);
	}
	
	@Test
	public void strStrTest_007() {
		
		// 实际值
		String result = getResult("2001:0db8:85a3:0000:0000:8a2e:0370:7334");
		// 比较结果
		Assert.assertEquals("IPv6", result);
	}
	
	@Test
	public void strStrTest_008() {
		
		// 实际值
		String result = getResult("2001:db8:85a3:0:0:8A2E:0370:7334");
		// 比较结果
		Assert.assertEquals("IPv6", result);
	}
	
	@Test
	public void strStrTest_009() {
		
		// 实际值
		String result = getResult("2001:0db8:85a3::8A2E:037j:7334");
		// 比较结果
		Assert.assertEquals("Neither", result);
	}
	
	@Test
	public void strStrTest_010() {
		
		// 实际值
		String result = getResult("02001:0db8:85a3:0000:0000:8a2e:0370:7334");
		// 比较结果
		Assert.assertEquals("Neither", result);
	}
	
	@Test
	public void strStrTest_011() {
		
		// 实际值
		String result = getResult("2001:0db8:85a3:0:0:8A2E:0370:7334:");
		// 比较结果
		Assert.assertEquals("Neither", result);
	}
	
	@Test
	public void strStrTest_012() {
		
		// 实际值
		String result = getResult("2001:0db8:85a3:0:0:8A2E:0370:7334:");
		// 比较结果
		Assert.assertEquals("Neither", result);
	}
	
	/* 
	 * 返回实际值
	 */
	private String getResult (String queryIP ) {
		Solution0468 test468 = new Solution0468();
		return test468.validIPAddress(queryIP);
	}
}
