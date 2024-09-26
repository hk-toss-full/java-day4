import cafe.Coffee;
import cafe.SeasonType;

import java.util.Scanner;

import static global.Data.coffees;

// classname.staicmethod();
// classname.staic변수;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < coffees.length; i++) {
            // 입력 받는 곳
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
        for (Coffee coffee: coffees) {
            System.out.println(coffee);
        }

    }
}