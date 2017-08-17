package day3;

public class bottlesofbeer {
	public static void main(String [] args) {
		for(int i = 99;i>0;i--) {
			if(i == 1) {
				System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.");
				System.out.println("Take one down and pass it around, no more bottles of beer on the wall");
			}else {
				System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.");
				System.out.println("Take one down and pass it around, " + (i-1) + " bottles of beer on the wall");
			}
			
		}
		System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
		System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall");
	}
}
