package ex03이중for문;

public class Ex02공포의별찍기 {

	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
