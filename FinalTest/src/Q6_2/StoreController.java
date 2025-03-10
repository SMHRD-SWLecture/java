package Q6_2;

import java.util.ArrayList;

class StoreController {

    private ArrayList<Store> stores;

    public StoreController() {
        stores = new ArrayList<>();
    }

    public void add(Store store) {
        stores.add(store);
    }

    public void showList(String type) {
        for (Store store : stores) {
            if ((type.equals("Restaurant") && store instanceof Restaurant) ||
                (type.equals("Salon") && store instanceof Salon)) {
                System.out.println(store.name + " 평점: " + store.grade());
            }
        }
    }

    public void showDetails(String name) {
        for (Store store : stores) {
            if (store.name.equals(name)) {
    
                // 평점 그래프 출력
                System.out.println();
                drawDetailedGraph(store.grade());
                return;
            }
        }
        System.out.println("해당 가게를 찾을 수 없습니다.");
    }

    private void drawDetailedGraph(double rating) {
        System.out.println("10  20  30  40  50  60  70  80  90 100");
    
        int graphLength = (int) Math.round(rating / 10) * 10; // 10 단위 반올림
        for (int i = 10; i <= 100; i += 10) {
            if (i <= graphLength) {
                System.out.print(" *  ");
            } else {
                System.out.print("    ");
            }
        }
    
        System.out.println("\n평점: " + rating);
    }

    public void showRatings() {
        System.out.println("\n--- 평점 그래프 ---");
        int maxRating = 100;

        for (int i = maxRating; i >= 10; i -= 10) {
            System.out.printf("%3d | ", i);
            for (Store store : stores) {
                if (store.grade() >= i) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        System.out.print("     ");
        for (Store store : stores) {
            System.out.print(store.name.substring(0, 3) + " ");
        }
        System.out.println();
    }

    private void drawGraph(double rating) {
        int maxGraph = 100;
        int graphLength = (int) Math.round(rating / 10) * 10;

        for (int i = 0; i <= maxGraph; i += 10) {
            if (i <= graphLength) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
        System.out.println("\n평점: " + rating);
    }
}

