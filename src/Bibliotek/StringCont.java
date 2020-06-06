package Bibliotek;

public class StringCont {

    private String[] data;


    public StringCont(String[] initialData){
        this.data = initialData;

    }


    public void set(String newData, int index){
        data[index] = newData;

    }

    public void add (String newData){


    }

    public void remove (int index){


    }


    public void swap (int left, int right){
    }




    public String toString(){
        String result = "";
        for (int i = 0; i <data.length ; i++) {
            result += data[i];
        }
        return result;

    }







}
