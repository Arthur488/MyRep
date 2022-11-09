package Tests.src;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] array = {9, 1, 15, 0, 7, 1, 3, 4, 55, 8, 17, 24, 2};

        System.out.println("Нечетные на спадание/Четные на возрастание");
        CoolSort1(array);
        System.out.println("Четные на спадание/Нечетные на спадание");
        CoolSort2(array);
    }

    static void CoolSort1(int[] array){

        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                if(array[i] % 2 == 1){
                    continue;
                }
                if(array[i] % 2 == 0){
                    int temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
            }
        }

        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - 1; i++){

                if (array[i] % 2 != 0 && array[i] < array[i + 1]){

                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }

                if(array[i] % 2 != 1 && array[i] > array[i + 1]){

                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }

            }
        }
        System.out.println(Arrays.toString(array));
    }

    static void CoolSort2(int[] array){
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                if(array[i] % 2 == 0){
                    continue;
                }

                if(array[i] % 2 == 1){
                    int temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
            }
        }

        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - 1; i++){

                if (array[i] % 2 == 0 && array[i + 1] % 2 == 0){
                    if(array[i] < array[i + 1]){
                        int temp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = temp;
                    }

                }

                if(array[i] % 2 == 1 && array[i + 1] % 2 == 1){
                    if(array[i] > array[i + 1]){
                        int temp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = temp;
                    }
                }

            }
        }
        System.out.println(Arrays.toString(array));
    }
}

//if(array[i] < 0){//-1
//        array[i] *= -1;//1
//        if(array[i] % 2 == 0){//-
//        array[i] *= -1;
//        continue;
//        }
//        if(array[i] % 2 == 1) {//+
//        array[i] *= -1;
//        }
//        }
