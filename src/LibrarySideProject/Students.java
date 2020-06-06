package LibrarySideProject;

import java.util.Date;

public class Students {
    static int Students=0;
    String id, name, contact;
    Date Date;
    Books Book;

    public Students (String id, String name, String contact, Books Book)
    this.id = id;
    this.name =name;
    this.contact = contact;
    this.Book = Book;
    this. Date = new Date();
    Students++;


}

public String toString(){
    return "Students{" + "id=" + id + ", name=" + name + ", contact=" + contact + ", Date=" + Date + ", Book" + Book + '}';

}