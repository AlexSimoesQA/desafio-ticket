package utils;

import java.util.Random;

public class GenerateUsername {
	
	public static String generateUsername() {
		return "teste1900" + new Random().nextInt(999);
	}

}
