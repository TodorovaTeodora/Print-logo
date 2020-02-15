package com.mentormate;

public class MM {
	
	public static void main(String[] args) {
		int width = InputReader.readLetterWidth();
		char[][] m = MMLogoUtil.genearateLogo(width);
		MMLogoUtil.print(m);
	}

}
