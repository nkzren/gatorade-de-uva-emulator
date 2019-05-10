package com.usp.ocd.ep2;

public class Util {
	public static Integer binaryToInteger(int[] binary) {
		Integer decimal = 0;
		int aux = 1;
		for (int i = binary.length - 1; i >= 0; i--) {
			decimal += binary[i] * aux;
			aux *= 2;
		}
		return decimal;
	}
}
