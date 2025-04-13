package prepare;

public class test_to_github {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello usf! my friend"); // 输出 Hello
		System.out.println("Hello usf! my friend modify and push"); // 输出 Hello and push to local git repo
		int i = 0;
		int sum_even = 0;
		int sum_odd = 0;
		outer:
			for (int j = 0; j < 10; j++) {
				i +=1;
				j= j+2;
//				/*
				inner:
					for (int k = 0; k < 5; k++) {
						if (k < 3 ) {
							i +=2;
//							k = k +2;
							System.out.println("i= "+i);
							continue inner;
						}
						else {
							j = j++;
							continue outer;
						}

					}
//				*/
				System.out.print(i+", ");
				if ((i % 2) == 0 ) {
					sum_even += i;
					continue outer;
				} else {
					sum_odd += i;
					continue outer;
				}
			}
		System.out.println("\nsum_even = "+sum_even+";  \nsum_odd = "+sum_odd);

	}

}
