package com.mentormate;

import java.util.Scanner;

public class InputReader {
	// Let's prevent the instantiation
	private InputReader() {}
	
	public static int readLetterWidth() {
		try (Scanner s = new Scanner(System.in)) { // Auto-closing block
			while (true) {
				System.out.print("N = ");
				String input = s.nextLine();
				try {
					int width = Integer.parseInt(input);
					if (width % 2 == 1) {
						return width;
					}
					
					System.out.println("Invalid input. Not an odd number.");
				} catch (NumberFormatException e) {
					System.out.println("Invalid input. Not a number.");
				}
			}
		}
	}

}
