package com.dsalgo.math;

public class DivideWithoutOperator {

	public int subtract(int dividend, int divisor, int result) {
		int sign = +1;
		if (dividend < 0 && divisor < 0) {
			sign = -1;
			dividend = sign * dividend;
			divisor = sign * divisor;
			sign = +1;
		}
		if (dividend < 0 || divisor < 0) {
			sign = -1;
			dividend = (dividend < 0 ? sign * dividend : dividend);
			divisor = (divisor < 0 ? sign * divisor : divisor);
		}
		if (dividend < divisor)
			return sign * result;
		else {
			dividend = dividend - divisor;
			result++;
			return sign * subtract(dividend, divisor, result);
		}
	}

	public int divide(int dividend, int divisor) {
		int sign = +1;
		if (divisor == 0) {
			System.out.println("Division with 0 not possible");
			return -1;
		} else if (divisor == 0)
			return 0;
		if (divisor < 0 || dividend < 0) {
			if (divisor < 0 && dividend < 0) {
				sign = +1;
				divisor = -1 * divisor;
				dividend = -1 * dividend;
			} else {
				sign = -1;
				divisor = divisor < 0 ? -1 * divisor : divisor;
				dividend = dividend < 0 ? -1 * dividend : dividend;
			}

		}
		int result = 0;
		while (dividend >= divisor) {
			dividend = dividend - divisor;
			result++;
		}
		return sign * result;

	}

	public static void main(String args[]) {

		DivideWithoutOperator dwo = new DivideWithoutOperator();
		System.out.println(dwo.subtract(27, -9, 0));
		System.out.println(dwo.divide(-9, -9));
	}

}
