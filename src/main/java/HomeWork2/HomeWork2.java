package HomeWork2;

import java.util.Arrays;

public class HomeWork2 {
    public static void main(String[] args) {
            static void invertingNumbers(int[] arr) {
            int[] arr1 = {0, 1, 1, 0, 0, 1};
            for (int i = 0; i < arr1.length; i++){
                if (arr1[i]==1) arr1[i] = 0;
                else arr1[i] = 1;
                System.out.println(arr1[i]);
            } ;
        }
        static void stepsArray (int[], arr) {
                int[] arr2 = new int[8];
                for (int i = 0; i< arr.length;i++) {
                    arr[i] = i*3
                }
        }
        static void multipliedArray (int[], arr) {
                int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
                for (int i = 0; i< arr3.length;i++) {
                    if (arr3[i]<6) arr3[i] = arr3[i]*2;
                }
        }
        static void diagonalInArray (int[], arr){
                int arr4[][] = new int[4][4];
                for (int i = 0; i<4; i++) {
                    arr4[i][i] = 1;
                    //Как сделать другую диагональ, не сообразил
                }
        }
    }
}
