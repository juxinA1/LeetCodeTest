package com.LeetCode.solution0926.test;

import org.junit.jupiter.api.Test;

import com.LeetCode.solution0926.Solution0926;
import com.LeetCode.solution0926.Solution0926_official;

public class Solution0926Test_performance {

	@Test
	public void minFlipsMonoIncrTest() {

		// 开始时间
		long startTime = System.currentTimeMillis();

		String str = "";
		for (int i = 0; i < 5363; i++) {
			str += (int) (Math.random() * 2);
			Solution0926 test926 = new Solution0926();
			test926.minFlipsMonoIncr(str);
		}

		// 开始时间
		long endTime = System.currentTimeMillis();

		// 运行时间
		System.out.println((endTime - startTime) + "ms");
	}

	@Test
	public void minFlipsMonoIncrTest_official() {

		// 开始时间
		long startTime = System.currentTimeMillis();

		String str = "";
		for (int i = 0; i < 5363; i++) {
			str += (int) (Math.random() * 2);
			Solution0926_official test926 = new Solution0926_official();
			test926.minFlipsMonoIncr(str);
		}

		// 开始时间
		long endTime = System.currentTimeMillis();

		// 运行时间
		System.out.println((endTime - startTime) + "ms");
	}
}
