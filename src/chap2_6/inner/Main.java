package chap2_6.inner;





public class Main {

    // 내부 클래스 (inner class)
    /*
     *   나는 연산을 위한 추가 구현체가 필요한데
     *   아무래도 그 설계도는 여기서 안에서만 쓰고
     *   다른 곳에서는 안쓸 것 같다.
     * */



    private static class SubCalculator implements Calculator {

        @Override
        public int operate(int n1, int n2) {
            return n1 - n2;
        }

    }

    public static void main(String[] args) {


        Calculator addCalculator = new AddCalculator();

        int result1 = addCalculator.operate(1, 2);
        System.out.println("result1 = " + result1);

        SubCalculator result2 = new SubCalculator();
        System.out.println(result2.operate(100, 2));

        /*
         *       익명 클래스 (anonymous class)
         *       - 나는 곱셈 계산기가 필요한데, 여기서만 쓰고 다른 곳에서는 안 쓸 것 같음
         *       - 근데 객체를 한번 생성하고 난 이후에는 설계도를 폐기하고 싶음.
         * */

        // 1회 호출만 가능
        Calculator multiCalculator = new Calculator() {
            @Override
            public int operate(int n1, int n2) {
                return n1 * n2;
            }

            // 클래스 내부
            private int a;

            public void foo() {
                System.out.println("하하호호");
            }
        };

        // JS의 함수는 변수에 저장이 가능, 함수를 변수에 저장하여 전달하는 것부터 JS 콜백의 시작

        // 자바의 callback은 메서드를 객체에 감싸서 전달 하는것 부터 시작







        int result3 = multiCalculator.operate(10, 20);
        System.out.println("result3 = " + result3);

        System.out.println("=====================");

        // 지금 급하게 레스토랑 예약을 해야됨, 요리도 빨리 해야됨
        // 근데 실제로 레스토랑이 안지어져있음. 심지어 설계도도 없음;;

        JapaneseRestaurant japaneseRestaurant = new JapaneseRestaurant();


        // java의 익명클래스 문법은 JS의 함수표현식과 닮아있다
        Restaurant restaurant = new Restaurant() {

            @Override
            public void cook() {
                System.out.println("한국식 음식을 만든다.");
            }
            @Override
            public void reserve() {
                System.out.println("한국식 음식을 예약한다.");
            }
        };


        restaurant.cook();
        restaurant.reserve();


    }
}
