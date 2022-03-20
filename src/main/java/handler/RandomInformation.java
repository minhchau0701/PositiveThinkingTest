package handler;

import java.util.Random;

public class RandomInformation {
	public String getAlphabet (int n) {
		int lowerLimit = 97;
		int upperLimit = 122;
		Random random = new Random();
		StringBuffer r = new StringBuffer();
		for (int i = 0; i < n; i++) {
			int nextRandomChar = lowerLimit + (int)(random.nextFloat() * (upperLimit - lowerLimit + 1)); 
			r.append((char)nextRandomChar);
		}
		
		return r.toString();
	}
	public int getNumber (int startNumber, int endNumber) {
		return startNumber + (int) Math.round(Math.random() * (endNumber - startNumber));
	}
}
