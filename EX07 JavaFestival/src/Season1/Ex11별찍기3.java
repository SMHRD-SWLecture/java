package Season1;

import java.util.Scanner;

public class Ex11별찍기3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int numbers[] = new int[5];

        // 사용자로부터 배열 값 입력받기
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(i + "번째 별의 수: ");
            numbers[i] = sc.nextInt();
        }

        // 별 출력
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " : ");
            for (int j = 0; j < numbers[i]; j++) {
                System.out.print("*");
            }
            System.out.println(); // 줄 바꿈
        }
	}

}
