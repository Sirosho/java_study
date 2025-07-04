package chap2_2.lang;


import java.util.Objects;

class Pen{
    long serial; // 일련번호
    String color;
    int price;



    // Java 기본 api인 Object 클래스의 toString() 메소드를 오버라이딩
    //



    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Pen pen)) return false;
        return serial == pen.serial && price == pen.price && Objects.equals(color, pen.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serial, color, price);
    }



    public Pen(long serial, String color, int price) {
        this.serial = serial;
        this.color = color;
        this.price = price;

    }
}

public class ObjectSample {
    public static void main(String[] args) {

        Pen yellowPen = new Pen(100, "노랑", 1000);
        Pen bluePen = new Pen(120, "파랑", 1000);
        Pen bluePen2 = new Pen(120, "파랑", 1000);


        System.out.println(yellowPen);
        System.out.println(bluePen);
        System.out.println(bluePen2);

        System.out.println("두 펜이 같은가? " + bluePen.equals(bluePen2));
    }

}
