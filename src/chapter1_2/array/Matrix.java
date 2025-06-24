package chapter1_2.array;

import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {


        /*
         *       [ [1,2,3],
         *         [4,5,6],
         *         [7,8,9] ]
         *    2차원 배열 : 다중 포인터 구조
         *
         *   위의 경우 Matrix 에는 배열 3개를 담은 배열의 주소가 저장
         *   heap 에서는 가장 바깥쪽 배열에 안에있는 3개의 배열의 주소가 또 저장
         *   값이 저장되어있는 3개의 배열이 생김
         *
         *   결과 heap에는 총 4개의 배열이 생김 1개: 3개의 주소값 저장
         *                                     3개: 배열의 값 저장
         *
         *
         */


        int[][] matrix = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        System.out.println(matrix[0][2]);
        System.out.println(Arrays.toString(matrix[0]));
        System.out.println(Arrays.toString(matrix)); // 2차원 배열에서는 이렇게 하면 안의 배열들의 주소가 나옴
        System.out.println(Arrays.deepToString(matrix));// 이러면 안의 배열들의 값이 나열


        System.out.println("======================");


        for (int[] arr : matrix) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }


        System.out.println("=============");
        for (int i = 0; i < matrix.length; i++) {
            int[] arr = matrix[i];
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }


        // 빈 2차원 배열

        // 3행 4열

        int[][] arr2d = new int[3][4];

        for (int[] arr : arr2d) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }


        // 3차원

        int[][][] arr3d = {
                {
                        {}, {}
                }, {
                {}, {}
        }

        };
    }
}
