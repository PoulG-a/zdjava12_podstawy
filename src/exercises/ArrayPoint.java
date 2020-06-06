package exercises;

public class ArrayPoint {

    public static void main (String[] args){
        int [] testArray = {10,20,1,3,100,200};

        show(testArray);

    }




    private static void show (int[] arr){
        if ( arr.length % 2  == 0 && arr.length > 1){

            int first = 0;
            int second = 1;


            while ( second <= arr.length ){
                System.out.println(arr[first] + arr[second]);

                first +=2;
                second +=2;

            }



        }else{
            System.out.println("nieparzysta liczba w tablicy ");
        }






    }


}
