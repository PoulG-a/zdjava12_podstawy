package LibrarySideProject;

import java.sql.SQLOutput;
import java.util.Scanner;

public class JavaLibrarian {


    public static void main (String[] args){

        Scanner in = new Scanner(System.in);

        admin a = new admin();
        String r = "";
        int a1 = 0;


        for (int i = 0; i < 8888888 ; i=i) {
            if ( i == 0){
                System.out.println("1 - Admin \n" + "2 - Librarian "+"\n3") ;
                r = in.next();
                if ( r.equals("1")){
                    i=1;
                }else if (r.equals("2")){
                    i=2;
                }else if (r.equals("3")){
                    break;
                }else System.out.println("Error");
            }if (i==2){
                System.out.println("Name :");
                r=in.next();
                if (a.rLibrarian(r) != 777) {
                    System.out.println("\npassword :");
                    r=in.next();
                    if (a.adam[a.rLibrarian(r)].Password.equals(r)){
                        System.out.println("");
                        a1=a.rLibrarian(r);
                        i=12;
                    }else { System.out.println("Error"); i=0; }
                }else { System.out.println("Error"); i=0; }
            }

            if (i==12){
                System.out.println("1 - Add Books\n" +"2 - View Books \n" +"3 - Issue Book\n" +"4 - View issued Books\n" +"5 - Return Books\n" +"6 - Logout");
                r=in.next();
                if (r.equals("1")){
                    i = 7;
                }else if (r.equals("2")){
                    i = 8 ;
                }else if ( r.equals("3")){
                    i = 9;
                }else if (r.equals("4")){
                    i = 10;
                }else if (r.equals("5")){
                    i = 11;
                }else if (r.equals("6")){
                    i = 0;
                }else System.out.println("ERROR");
            }if (i == 1) {
                System.out.println("Studentsid or Studentsname :");
                r=in.next();
                if (a.adam[a1].rStudents(r) != 777 ){
                    // i dont fucking now  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
                    a.adam[a1].adam1[a.adam[a1].rStudents(r)].Book.Outside="0";
                            a.adam[a1].deleteStudents(a.adam[a1].rStudents(r));
            }
                i = 12;
            }
            if (i == 10){
                for (int j = 0; j <a.adam[a1].Books; j++) {
                    if (a.adam[a1].adam0[j].Outside.equals("1")){
                        System.out.println(a.adam[a1].adam1[j]);
                    }
            }
                i = 12;
            }
            if (i == 9){
                System.out.println("book name or id :");
                r=in.next();
                if (a.adam[a1].rbook(r) != 777 ){
                    System.out.println(", Books Book)");
                    System.out.println("Studentsid  :");
                    String aa21 = in.next();
                    System.out.println("\nStudentsname  :");
                    String aa22=in.next();
                    System.out.println("\nStudentscontact  :");
                    String aa23 =in.next();
                    a.adam[a1].addStudents(aa21, aa22, aa23, a.adam[a1].adam0[a.adam[a1].rbook(r)]);
                    a.adam[a1].adam0[a.adam[a1].rbook(r)].Outside="1";
                    System.out.println("");

                }else System.out.println("ERROR");
                i = 12;
            }
            if (i ==8) {
                for (int j = 0; j < a.adam[a1].Books ; j++) {
                    System.out.println(a.adam[a1].adam0[j]);
            }
                i =12;
            }
            if ( i == 7 ){
                System.out.println("");
                System.out.println("Id  :");
                String n121=in.next();
                System.out.println("\nCallno   :");
                String n122=in.next();
                System.out.println("\nName   :");
                String n123=in.next();
                System.out.println("\nAuthor");
                String n124=in.next();
                System.out.println("\nPublisher  :");
                String n125=in.next();
                System.out.println("\nIssued   :");
                String n126=in.next();
                a.adam[a1].addBook(n121, n122, n123, n124, n125, n126);
                System.out.println("");
                i=12;

            }

            if ( i == 1) {
                System.out.println("Your name  :");
                String q1=in.next();
                if (a.name.equals(q1)) {
                    System.out.println("\nYour password  :");
                    String q2=in.next();
                    if (a.password.equals(q2)) {
                        i=3;
                    }else System.out.println("ERROR");
                }else System.out.println("ERROR");
            }if (i==3){
                System.out.println("1 - Add librarian\n" +"2 - View librarian\n" +"3 - Delate librarian\n" +"4 - Logout\n");
                r=in.next();
                if (r.equals("1")){
                    i=4;
                }else if (r.equals("2")){
                    i=5;
                }else if (r.equals("3")){
                    i=6;
                }else if (r.equals("4")){
                    i=0;
                }else System.out.println("ERROR");
            }
            if ( i == 6) {
                System.out.println("name or id");
                r=in.next();
                if (a.rLibrarian(r) !=777 ){
                    a.deleteLibrarian(a.rLibrarian(r));
                }else System.out.println("ERROR");
                i=3;
            }


            if (i == 5){
                for (int j = 0; j < Librarian.Librarian ; j++) {
                    System.out.println(a.adam[j]);
            }
            i = 3;
            }

            if ( i ==4){
                System.out.println(", String Contact");
                System.out.println("Id  : ");
                String na1=in.next();
                System.out.println("\nName   :");
                String na2=in.next();
                System.out.println("\nPassword  :");
                String na3=in.next();
                System.out.println("\nEmail  :");
                String na4=in.next();
                System.out.println("\nAddress   :");
                String na5=in.next();
                System.out.println("\nCity   :");
                String na6=in.next();
                System.out.println("\nContact   :");
                String na7=in.next();
                System.out.println("\n");
                a.addLibrarian(na1, na2, na3, na4, na5, na6, na7);
                i = 3;

            }




        }





    }










}
