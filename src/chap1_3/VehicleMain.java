package chap1_3;

public class VehicleMain {
    public static void main(String[] args) {


        Vehicle granduer = new Vehicle("현대","그랜져");
        Vehicle panamera = new Vehicle("현대","그랜져");


        granduer.powerOn();

        System.out.println("granduer = " + granduer);
        System.out.println("panamera = " + panamera);

    }

}
