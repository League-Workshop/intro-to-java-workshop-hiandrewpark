package day1.robot;

public class ForLoopGauntlet {
	public static void main(String [] args) {
		
		int x = 1;
		for(int i = 0;i<101;i++){
			System.out.print(i + " ");
		}
		System.out.println();
		for(int j = 100;j>-1;j--) {
			System.out.print(j + " ");
		}
		System.out.println();
		for(int k = 2;k<101;k++) {
			System.out.print(k + " ");
		}
		System.out.println();
		for(int y = 1;y<100;y++) {
			if(y % 2 == 1) {
				System.out.print(y + " ");
			}
		}
		System.out.println();
		for(int u = 1;u<501;u++) {
			if(u%2 == 0) {
				System.out.print(u + " even" + " ");
			}else {
				System.out.print(u + " odd" + " ");
			}
		}
		System.out.println();
		for(int r = 0;r<778;r+=7) {
				System.out.print(r + " ");
		}
		System.out.println();
		for(int w = 2000; w<2018;w++) {
			System.out.print("In " + w + ", I was " + x + " year(s) old." + " ");
			x = x + 1;
		}
		System.out.println();
		for(int s = 0;s<3;s++) {
			for (int z = 0;z<3;z++) {
				System.out.println(s + " " + z + " ");
			}
		}
		System.out.println();
		
		for(int v = 1;v<2;v++) {
			for(int n = 1;n<10;n++) {
				System.out.print(n + " ");
				if(n%3 == 0) {
					System.out.println();
				}
			}
		}
		System.out.println();
		
		for(int e = 1;e<2;e++) {
			for(int q = 1;q<101;q++) {
				System.out.print(q + " ");
				if(q%10 == 0) {
					System.out.println();
				}
			}
		}
		System.out.println();
		
		for(int o = 1; o<7;o++) {
			for(int g = 1;g<=o;g++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		for(int i = 1;i<21;i++) {
			if (i%3 == 0 && i%5 == 0 ) {
				System.out.print("fizzbuzz ");
			}
			else if(i%3 == 0) {
				System.out.print("fizz ");
			}
			else if(i%5 == 0){
				System.out.print("buzz ");
			}else {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		int num1 = 0;
		int num2 = 1;
		int num3 = 0;
		for(int p = 0;p<20;p++) {
			if (p < 2) {
				System.out.print(p + " ");
			}
			else {
				System.out.print(num1 + num2 + " ");
				num3 = num1;
				num1 = num2;
				num2 = num2 + num3;
			}
		}
				
	}
}
