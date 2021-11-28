package com.gmail.kutepov89.sergey;

public class Main {

	public static void main(String[] args) {
		int size = 5;
		String v = "";
		String[] rowArray = new String[5];
		
		rowArray[0] = "  ***  ****   ***  ****  ***** *****  **** *   *  ***    *** *   * *     *   * *   *  ***  ****   ***   ***   **** ***** *   * *   * *   * *   * *   * *****";
		rowArray[1] = " *   * *   * *   * *   * *     *     *     *   *   *       * *  *  *     ** ** **  * *   * *   * *   * *   * *       *   *   * *   * *   * *   * *   *    * ";
		rowArray[2] = " ***** ****  *     *   * ****  ****  *  ** *****   *   **  * ***   *     * * * * * * *   * ****  *   * ****   ***    *   *   * *   * * * *  ***   ***    *  ";
		rowArray[3] = " *   * *   * *   * *   * *     *     *   * *   *   *   *   * *  *  *     *   * *  ** *   * *     *  *  * *       *   *   *   *  * *  * * * *   *   *    *   ";
		rowArray[4] = " *   * ****   ***  ****  ***** *      **** *   *  ***   ***  *   * ***** *   * *   *  ***  *      ** * *   * ****    *    ***    *    ***  *   *   *   *****";

		String text = "never give up";
		char[] t = text.toUpperCase().toCharArray();

		for (int i = 0; i < size; i++) {

			for (int j = 0; j < t.length; j++) {
				char character = t[j];
				if (character != 32) {
					int ascii = (int) character;
					int sub = (ascii - 65) * size + (ascii - 65);

					v += rowArray[i].substring(sub, sub + 6);
				} else {
					v += "     ";
				}

			}
			v += "\n";
		}
		System.out.println(v);
	}

}