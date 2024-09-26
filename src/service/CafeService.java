package service;

import cafe.Coffee;
import controller.CafeController;
import repository.CafeRepository;

import static global.Data.coffees;

// service 유저의 입력으로 나의 로직을 처리하는 곳
// 개발자가 로직을 펼치는 곳?
// Coffee 라고 했어야함
public class CafeService {
    public void coffeeAdd(String[] strings){
        // 유저에게 입력 받는 것으로 생성하기 위한 로직
        try {
            // 커피 만들기
            Coffee coffee = Coffee.of(strings);
            // 저장
            cafeRepository.save(coffee);
        }catch (NumberFormatException e){
            System.out.println("가격 입력 똑바로");
        }catch (IllegalArgumentException e){
            System.out.println("타입 똑바로");
        }
    }



    public static CafeService getInstance() {
        if(cafeService == null){
            cafeService = new CafeService();
        }
        return cafeService;
    }
    private static CafeService cafeService;
    private CafeService() {
        this.cafeRepository = CafeRepository.getInstance();
    }
    private final CafeRepository cafeRepository;
}
