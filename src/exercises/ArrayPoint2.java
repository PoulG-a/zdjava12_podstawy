package exercises;

public class ArrayPoint2 {

    public static void main (String[] args){
        int[] arry = {1,3,2,4,5,6};

       bubbleSort(arry);

        print(arry);


    }

    private static void bubbleSort (int[] arry){
        for (int i = 0; i < arry.length - 1 ; i++) {
            for (int j = 0; j < arry.length - i - 1 ; j++) {
                int left = j;
                int right = j + 1;

                if (arry[left] > arry[right]){
                    swap(arry, left, right);
                }

            }
        }





    }





    public static void print(int[] arry){
        for (int i = 0; i <arry.length ; i++) {
            System.out.println(arry[i]);
        }

    }



    public static void swap (int[] arry, int indexLeft, int indexRight){

        int leftV = arry[indexLeft];
        int rightV = arry[indexRight];

        arry[indexLeft] = rightV;
        arry[indexRight] = leftV;


    }













}
