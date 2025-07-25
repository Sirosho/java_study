package chap2_8.stream;

import static chap2_8.stream.Menu.menuList;

public class Finding {
    public static void main(String[] args) {

        // 요리 목록에서 채식주의자가 먹을 수 있는 요리가 하나라도 있는가?

        boolean flag = menuList.stream()
                .anyMatch(menu -> menu.isVegetarian()); // 하나라도 있는지 boolean으로 반환
        // 요리 목록에서 모든 요리가 1000 칼로리 미만입니까?
        boolean flag2 = menuList.stream()
                .allMatch(m -> m.getCalories() < 1000); // 모두 1000 칼로리 미만인지 boolean으로 반환

        // 요리중에 첫번째 발견된 생선요리를 찾기 : find
        Dish firstFishDish = menuList.stream()
                .filter(m -> m.getType() == DishType.FISH)
                .findFirst()
                .get();


    }
}
