package com.mentormate;

public class MMLogoUtil {
	private static final char FILLER = '-';
	private static final char LETTER = '*';
	
	// Let's prevent the instantiation
	public MMLogoUtil() {}
	
	/** Generates a two-dimensional array, filled with "filler" and "letter" symbols, representing the MM logo.
	 * 
	 * @param letterWidth width of the letter
	 * @return two-dimensional char-array
	 */
	public static char[][] genearateLogo(int letterWidth) {
		int rows = letterWidth + 1;		// Rows are always Width + 1
		int cols = 10 * letterWidth;	// Columns are always 10 times more than the letter's width
		char[][] m = new char[rows][cols];
		
		initialFill(m);
		
		// Fill the logo "towers". There are four of them - two for each M
		fill(m, letterWidth, 0);         		// Tower 1: /\
		fill(m, letterWidth, letterWidth * 2);	// Tower 2: /\/\
		fill(m, letterWidth, letterWidth * 5);	// Tower 3: /\/\ /\
		fill(m, letterWidth, letterWidth * 7);	// Tower 4: /\/\ /\/\
		
		return m;
	}
	
	/** Prints the two-dimensional array in form of rows and columns to the standard output
	 * 
	 * @param m two-dimensional char-array to be printed
	 */
	public static void print(char[][] m) {
		for (int row = 0; row < m.length; row++) {
			for (int col = 0; col < m[row].length; col++) {
				System.out.print(m[row][col]);
			}
			System.out.println();
		}
	}
	
	// #########################
	// #### PRIVATE METHODS ####
	// #########################
	
	/** Fills the two-dimensional array with "filler" symbols
	 * 
	 * @param m two-dimensional char-array to be filled with special "filler" symbol
	 */
	private static void initialFill(char[][] m) {
		for (int row = 0; row < m.length; row++) {
			for (int col = 0; col < m[row].length; col++) {
				m[row][col] = FILLER;
			}
		}
	}
	
	/** Generates one of the four "towers" (/\) of the MM logo
	 * 
	 * @param m two-dimensional array to be filled
	 * @param w letter's width
	 * @param startFrom index of which each "tower" starts
	 */
	private static void fill(char[][] m, int w, int startFrom) {
		// This just creates a "tower" filled with "letter" symbols without the empty space at the bottom.
		// Something like a Christmas tree without the sharp top :)

		for (int row = 0; row < m.length; row++) {											//      *****
			int start = startFrom + w - row;	 // How many spaces to skip on each row		//     *******
			int end   = startFrom + w * 2 + row; // How "thick" the tower is on each row	//    *********
			for (int col = start; col < end; col++) {										//   ***********
				m[row][col] = LETTER;														//  *************
			}																				// ***************
		}
		
		clear(m, w, startFrom);
	}
	
	/** Clears one of the four bottom empty spaces (/\) in MM logo
	 * 
	 * @param m two-dimensional array to be cleared
	 * @param w letter's width
	 * @param startFrom index of which each "tower" starts
	 */
	private static void clear(char[][] m, int w, int startFrom) {
		// The "tower" must have "filler" symbols at the bottom, so let's clear that triangle part
		
		// Start from the bottom to the top and don't go beyond the half of the "tower"
		for (int r = w; r >= m.length / 2; r--) {															//      *****
			int strt = startFrom + w + w - r; // Skip the W symbols on each row + initial "empty" spaces	//     *******
			int clearSize = 2 * (w - r);	  // How many symbols must be "cleared" 						//    *********
			int end  = strt + w - clearSize;  // Calculate the last index for clearing						//   *****-*****
			for (int c = strt; c < end; c++) {																//  *****---*****
				m[r][c] = FILLER;																			// *****-----*****
			}
		}
	}
	
}
