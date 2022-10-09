package com.LeetCode.solution0870.test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.LeetCode.solution0870.Solution0870_3;

public class Solution0870Test {

	@Test
	public void advantageCountTest_001() {

		// 实际值
		int[] nums1 = { 2, 7, 11, 15 };
		int[] nums2 = { 1, 10, 4, 11 };
		int[] result = getResult(nums1, nums2);

		// 预想值
		int[] expect = { 2, 11, 7, 15 };

		// 比较结果
		Assert.assertArrayEquals(expect, result);
	}

	@Test
	public void advantageCountTest_002() {

		// 实际值
		int[] nums1 = { 12, 24, 8, 32 };
		int[] nums2 = { 13, 25, 32, 11 };
		int[] result = getResult(nums1, nums2);

		// 预想值
		int[] expect = { 24, 32, 8, 12 };

		// 比较结果
		Assert.assertArrayEquals(expect, result);
	}

	@Test
	public void advantageCountTest_003() {

		// 实际值
		int[] nums1 = { 2, 0, 4, 1, 2 };
		int[] nums2 = { 1, 3, 0, 0, 2 };
		int[] result = getResult(nums1, nums2);

		// 预想值
		int[] expect = { 2, 0, 1, 2, 4 };

		// 比较结果
		Assert.assertArrayEquals(expect, result);
	}

	/*
	 * 返回实际值
	 */
	private int[] getResult(int[] nums1, int[] nums2) {
		Solution0870_3 test = new Solution0870_3();
		return test.advantageCount(nums1, nums2);
	}

}
