package LibrarySideProject;

import java.awt.print.Book;
import java.util.Date;

public class Librarian {
        static int Librarian=0;
        String Id, Name, Password, Email, Address, City, Contact ;
        Date Date;
        Books adam0[];
        Students adam1[];
        int Students =0;
        int Books = 0;



        public Librarian (String Id, String Name, String Password, String Email, String Address, String City, String Contact) {
            this.Id = Id;
            this.Name = Name;
            this.Email = Email;
            this.Address = Address;
            this.City = City;
            this.Contact = Contact;
            adam0 = new Books[20];
            adam1 = new Students[20];
            this.Date = new Date();
        }

        void addBook (String Id, String Callno, String Name, String Author,String Publisher, String Issued ){
        adam0[Books] = new Books (Id, Callno, Name, Author, Publisher, Issued);
        Books++;
        }

        void addStudents(String id, String name, String contact, Books Book ){
        adam1[Students] = new Students(id, name, contact, Book);
        Students++;
        }

        void deleteStudents (int a){
            adam1[a] = adam1[Students -1];
            Students--;
        }

        int rStudents (String a){
            int aa=777;
            for (int i = 0; i < Students ; i++) {
                if (adam1[i].id.equals(a)) {
                aa = i ; break;
                }else if (adam1[i].name.equals(a)) { aa=i; break;}
            }
            return aa;
        }
        int rbook (String a){
            int aa=777;
            for (int i = 0; i < Books ; i++) {
                if (adam0[i].Id.equals(a)){
                    aa=i; break;
                }else if (adam0[i].Name.equals(a)) {aa=i; break;}
            }
            return  aa;
        }

        public String toString (){
            return "Libratrian{" + "Id=" + Id + ", Name=" + Name + ", Password=" + Password + ", Eamil=" + Email + ", Address=" + Address + ",City=" + City + ", Contact=" + Contact + ", Date=" + Date + ", Books=" + Books + ", Books-Students=" + Students + '}';
        }


}

