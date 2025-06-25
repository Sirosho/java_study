

package chapter1_2.method;

import java.util.Arrays;

public class MethodQuiz {
    static String[] foods = {"떡볶이", "치킨", "파스타"};
    public static void main(String[] args) {

        printFoods();

        push("라면");
        push("김치찌개");
        printFoods();

        int index = indexOf("파스타");
        System.out.println("index = " + index);

        int index2 = indexOf("라면땅");
        System.out.println("index2 = " + index2);

        pop();
        printFoods();
//        remove("치킨");
////        remove(0);
//        printFoods();
////
////
//        boolean flag1 = include("파스타");
//        System.out.println("flag1 = " + flag1);
//
//        boolean flag2 = include("떡라면");
//        System.out.println("flag2 = " + flag2);
//
//        insert(1, "파인애플");
//
//        printFoods();
//
//        modify(2, "닭갈비");
//        printFoods();
    } // end main


  static  void printFoods() {
        System.out.println(Arrays.toString(foods));
    }





   static String[] push(String food) {
        String[] temp = new String[foods.length+1];

        for (int i = 0; i < foods.length; i++) {
                temp[i] = foods[i];
        }
        temp[temp.length-1] = food;
        foods = temp;
        temp = null;
        return foods;
    }


    static int indexOf(String food) {

        int index = -1;
        for (int i = 0; i < foods.length; i++) {
            if (foods[i].equals(food)) {
                index = i;
            }
        }

        return index;
    }


    static void pop() {

        String[] temp = new String[foods.length-1];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = foods[i];
        }
        foods = temp;
        temp = null;
    }





}// end class


