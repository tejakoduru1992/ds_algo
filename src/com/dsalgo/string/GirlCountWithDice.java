package com.dsalgo.string;

/*Input format

A single line that contains a string   denoting the sequence of numbers the dice rolls on written as string.

Output format

If the sequence is valid print the number of girls  
If the sequence is invalid print 

Sample Input
3662123
Sample Output
5

Explanation
The second person rolls the dice 3 times so the number of people will be 5.

4561123 -- Pass

3662126  */

public class GirlCountWithDice {

	public Integer getGirlCount(String seq) {

		int i = 0, count = 0;
		while (i < seq.length()) {

			if (seq.charAt(i) == '6' && i != seq.length() - 1) {
				i++;

			} else if (seq.charAt(i) == '6' && i == seq.length() - 1) {
				System.out.println("Invalid Input");
				return -1;
			} else {
				count++;
				i++;
			}
		}
		return count;

	}

	public static void main(String args[]) {
		GirlCountWithDice gc = new GirlCountWithDice();
		System.out.println("Heree");
		System.out.println(gc.getGirlCount("3662123"));

	}

}
