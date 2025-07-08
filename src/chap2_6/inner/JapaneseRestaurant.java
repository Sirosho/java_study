package chap2_6.inner;

public class JapaneseRestaurant implements Restaurant {

    @Override
    public void cook() {
        System.out.println("한국식 음식을 만든다.");
    }
    @Override
    public void reserve() {}
}
