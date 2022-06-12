package com.LeetCode.solution0926.test;

import org.junit.jupiter.api.Test;

import com.LeetCode.solution0926.Solution0926;
import com.LeetCode.solution0926.Solution0926_official;

public class Solution0926Test_performance {

	/**
	 * 0:自己，1:官方，2-N:其他
	 */
	private static int type = 1;

	@Test
	public void minFlipsMonoIncrTest() {

		// 开始时间
		long startTime = System.currentTimeMillis();

		String str = "";
		for (int i = 0; i < 5363; i++) {
			str += (int) (Math.random() * 2);
			getResult(str);
		}

		// 开始时间
		long endTime = System.currentTimeMillis();

		// 运行时间
		System.out.println((endTime - startTime) + "ms");
	}

	/*
	 * 返回实际值
	 */
	private int getResult(String str) {
		if (type == 0) {
			Solution0926 test926 = new Solution0926();
			return test926.minFlipsMonoIncr(str);
		} else if (type == 1) {
			Solution0926_official test926 = new Solution0926_official();
			return test926.minFlipsMonoIncr(str);
		}

		return 0;
	}
}
