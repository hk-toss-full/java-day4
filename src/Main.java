import cafe.Coffee;
import controller.CafeController;

import static global.Data.coffees;
import static global.Utils.sc;

public class Main {
    public static void main(String[] args) {
        System.out.println("데이터를 넣을래요????? 맞으면 1");
        for (int i = 0; i < 1; i++) {
            CafeController cafeController = CafeController.getInstance();
            cafeController.addCoffee(i);
        }
        for (Coffee coffee: coffees) {
            System.out.println(coffee);
        }

    }
}