package Q6_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		StoreController ctrl = new StoreController();
		Scanner sc = new Scanner(System.in);

		ctrl.add(new Restaurant("해성식당", "한식뷔페", 75, 75, 75, 75));
		ctrl.add(new Restaurant("정림이네", "제육", 92.75, 92.75, 92.75, 92.75));
		ctrl.add(new Restaurant("왕뼈사랑", "감자탕", 76, 76, 76, 76));
		ctrl.add(new Salon("박승철", "박승철", 89.33, 89.33, 89.33));
		ctrl.add(new Salon("이가자", "이가자", 90.33, 90.33, 90.33));
		ctrl.add(new Salon("리안", "리안", 87, 87, 87));
		

		while(true) {
			System.out.print("[1]음식점보기 [2]미용실보기 [3]상세보기 [4]평점보기 [5]종료 >> ");
			int choice = sc.nextInt();
			System.out.println();

			switch(choice) {
				case 1:
					ctrl.showList("Restaurant");
					System.out.println();
					break;
				
				case 2:
					ctrl.showList("Salon");
					System.out.println();
					break;

				case 3:
					System.out.println("====상세정보====");
					System.out.print("가게명 입력 : ");
					String storeName = sc.next();
					System.out.println("가게명 : " + storeName);
					ctrl.showDetails(storeName);
					System.out.println();
					break;

				case 4:
					System.out.println("평점보기");
					break;

				case 5:
					System.out.println("종료");
					sc.close();
					return;

				default:
					System.out.println("정확한 숫자를 입력해주세요.");
					System.out.println();
					break;
			}
		}
	}

}
