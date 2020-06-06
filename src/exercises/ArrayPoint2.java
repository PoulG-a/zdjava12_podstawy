package exercises;

public class ArrayPoint2 {

    public static void main (String[] args){
        int[] arry = {5,4,3,2,1};

        swap(arry, 1, 2 );

        print(arry);


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
