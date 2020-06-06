package LibrarySideProject;

import com.thobho.objects.Address;

public class admin {
    String name, password;
    Librarian[]adam;

    public admin(){
        adam = new Librarian[20];
        name = "admin";
        password = "admin";
    }


    void addLibrarian (String Id, String Name, String Password, String Email, String Address, String City, String Contact ) {
        adam[Librarian.Librarian] = new Librarian(Id, Name, Password, Email, Address, City, Contact);
        Librarian.Librarian++;
    }

    void deleteLibrarian (int a ){
        adam[a]=adam[Librarian.Librarian-1];
        Librarian.Librarian--;
    }

    int rLibrarian(String a){
        int aa=777;
        for (int i = 0; i <Librarian.Librarian ; i++) {
            if (adam[i]).Name.equals(a)) {
            aa=i; break;
            }if (adam[i].Id.equals(a)){
                aa=i; break;
            }
        }
        return aa;
    }



}
