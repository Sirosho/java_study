package chap2_8.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static chap2_8.stream.Menu.menuList;

public class Sorting {

    public static void main(String[] args) {

        // 육류 요리중 칼로리가 낮은 순으로 정렬하기

        List<Dish> lowCalorieMeats = menuList.stream()
                .filter(m -> m.getType() == DishType.MEAT)
                .sorted(Comparator.comparing(Dish::getCalories))
                .collect(Collectors.toList());

        lowCalorieMeats.forEach(System.out::println);


        // 메뉴들을 이름 내림차로 정렬 ()


        System.out.println("========================");

        List<Dish> sortedMenu = menuList.stream()
                .sorted(Comparator.comparing(Dish::getName))
                .collect(Collectors.toList());
        sortedMenu.forEach(System.out::println);


        System.out.println("========================");


        List<Dish> topThreeLowCalorieDishes = menuList.stream()
                .filter(m -> m.getCalories() > 300)
                .sorted(Comparator.comparing(Dish::getCalories))
                .limit(3)
                .collect(Collectors.toList());

        topThreeLowCalorieDishes.forEach(System.out::println);


    }
}
