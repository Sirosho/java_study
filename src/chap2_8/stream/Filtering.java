package chap2_8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static chap2_8.stream.Menu.menuList;
import static java.util.stream.Collectors.toList;

public class Filtering {
    public static void main(String[] args) {

        // 요리 메뉴 중 채식주의자가 먹을 수 있는 요리만 필터링
        List<Dish> vegetarianList = new ArrayList<>();

        for (Dish dish : menuList) {

            if(dish.isVegetarian()){
                vegetarianList.add(dish);
            }

        }


        menuList.stream()
                .filter(new Predicate<Dish>() {
                    @Override
                    public boolean test(Dish dish) {
                        return dish.isVegetarian();
                    }

                });

        menuList.stream()
                .filter(menu -> menu.getName().length() ==4)
                .collect(toList())
                .forEach(System.out::println);


        // 300 칼로리보다 큰요리 중 앞에서 3개만 필터링

        menuList.stream()
                .filter(m ->m.getCalories()>300)
                .limit(3) // 앞에서부터 3개만 가져옴
                .collect(toList())
                .forEach(System.out::println);

        System.out.println("==========================");

        // 300 칼로리보다 큰 요리 중 처음 2개는 건너뛰고 필터링
        menuList.stream()
                .filter(m ->m.getCalories()>300)
                .skip(2) // 처음 2개는 건너뛰고
                .collect(toList())
                .forEach(System.out::println);

        System.out.println("==========================");

        List<Integer> numbers = List.of(1, 2, 1, 2, 2, 3, 4, 5, 6, 1, 2, 76, 7, 8, 9, 9, 8, 5);

        // 숫자리스트에서 짝수만 필터링

        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .distinct()// 중복 제거해줌
                .collect(toList());

        System.out.println(evenNumbers);

    }
}
