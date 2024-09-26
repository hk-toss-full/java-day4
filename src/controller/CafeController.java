package controller;

import cafe.Coffee;
import global.Utils;


import static global.Data.coffees;
import static global.Utils.sc;

public class CafeController {
    public static CafeController getInstance(){
        if(cafeController == null){
            cafeController = new CafeController();
        }
        return cafeController;
    }

    private static CafeController cafeController;

    private CafeController() {}


    public void addCoffee(int i){
        String st = sc.nextLine();
        String[] strings = st.split(" ");

        // 생성하기위한 처리
        try {
            Coffee coffee = Coffee.of(strings);
            coffees[i] = coffee;
        }catch (NumberFormatException e){
            System.out.println("가격 입력 똑바로");
            i--;
        }catch (IllegalArgumentException e){
            System.out.println("타입 똑바로");
            i--;
        }
    }
    public void removeCoffee(int i){

    }
}
