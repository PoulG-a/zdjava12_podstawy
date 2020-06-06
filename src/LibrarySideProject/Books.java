package LibrarySideProject;

import java.util.Date;

public class Books {
    static int Books = 0;
    String Id,Callno,Name,Author,Publisher,Quantity,Issued, Outside;
    java.util.Date Date;

    public Books (String Id, String Callno, String Name, String Author, String Publisher, String Issued,)
        this.Id = Id;
        this.Callno = Callno;
        this.Name = Name;
        this.Author = Author;
        this.Publisher = Publisher;
        this.Issued = Issued;
        this.Date = new Date();
        Quantity = Issued;
        this.Outside="0"
        Books++;

}

public String toString (){
    return "Books{" + "ID=" + Id + " , Callno=" + Callno + ", Name=" + Name + ", Author=" + Author + ", Publisher=" + Publisher + ", Quantity=" + Quantity + ", Issued=" + Issued + ", Date=" + Date + "}";

}