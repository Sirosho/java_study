package chap2_8.stream;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static chap2_8.stream.Menu.menuList;
import static java.util.stream.Collectors.toList;

public class Mapping {

    public static void main(String[] args) {

        // 요리의 이름들만 추출
        List<String> dishNames = menuList.stream()
                .map(menu -> menu.getName())
                .collect(toList());

        System.out.println("dishNames = " + dishNames);

        System.out.println("========================");

        List<String> browsers = List.of("safari", "chrome", "firefox", "ms edge", "opera", "firefox");

        // 브라우저 목록에서 브라우저의 각 글자수를 수집

        List<Integer> lengthList = browsers.stream()
                .map(s -> s.length())
                .collect(toList());

        System.out.println("lengthList = " + lengthList);


        List<String> characterList = browsers.stream()
                .map(s -> String.valueOf(s.charAt(0)))
                .collect(toList());

        System.out.println("characterList = " + characterList);

        System.out.println("========================");

        List<Map<String, Object>> menuDetails = menuList.stream()
                .map(menu -> {
                    Map<String, Object> menuMap = new HashMap<>();
                    menuMap.put("name", menu.getName());
                    menuMap.put("calories", menu.getCalories());
                    return menuMap;
                })
                .collect(toList());


//        List<SimpleDish> simpleDishList = menuList.stream()
//                .map(menu -> new SimpleDish())
//                .collect(toList());


        /*
        *   요리 목록에서 500칼로리 이상의 메뉴들의 메뉴 이름만 추출
        *
        * */
        List<String> highCalorieDishes = menuList.stream()
                .filter(m -> m.getCalories() >= 500)
                .map(m -> m.getName())
                .collect(toList());

        System.out.println("highCalorieDishes = " + highCalorieDishes);
    }

    /*
            메뉴 목록에서 칼로리가 500칼로리보다 큰
            음식들을 필터링한 다음에 음식의 이름과 타입만
            추출해서 출력해주세요.

            단, 타입은 MEAT의 경우 육류라고 저장
            FISH는 어류라고 저장, OTHER 기타라고 저장
         */








}
