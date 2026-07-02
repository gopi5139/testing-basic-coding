package basic_programs;

import java.util.Random;

public class RandomNumberGeneration {

	public static void main(String[] args) {
		RandomNumberGeneration rand = new RandomNumberGeneration();
		String l = rand.genRandom10Digit();
		System.out.println(l);
		genRandom4Digit();
		System.out.println(getRandomNumberString());
	}
	
	public static void genRandom4Digit() {
		Random random = new Random();
		int num = random.nextInt(8999);
		System.out.println(String.format("%4d", num));
	}
	public String genRandom10Digit() {
	    Random r = new Random(System.currentTimeMillis());
	    String s = "8"+(180000000 + r.nextInt(900000000));
	    return s;
	}
	
	public static String getRandomNumberString() {
	    // It will generate 6 digit random Number.
	    // from 0 to 999999
	    Random rnd = new Random();
	    int number = rnd.nextInt(999999);

	    // this will convert any number sequence into 6 character.
	    return String.format("%6d", number);
	}

}
