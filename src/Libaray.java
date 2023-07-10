class LibraryItem
{
    private int id;
    String tittle;
    int year;
    public int getId()
    {
        return id;
    }
    public void setId(int newId)
    {
     this.id=newId;
    }
    void libaray()
    {
        System.out.println("Available book id is "+id +" and title is "+tittle +" Published in "+year );
    }
}
class Book extends LibraryItem
{
    String author;
    public void printDetials(String author,int id,String title,int year)
    {
        System.out.println("Author name is "+author+" "+id+" title is "+title+" published in "+year);
    }

}
class Magazine extends Book
{
   int issue;
   public void authorname(int year)
   {
       System.out.println("This book was issue in the year "+year);
   }


}

public class Libaray {
    public static void main(String[] args) {
        Magazine book=new Magazine();
        book.setId(101);
        book.tittle="BecomeRich";
        book.year=2003;
        book.libaray();
        System.out.println(book.getId());
        book.tittle="Shakeshpere";
        System.out.println(book.tittle);
        book.printDetials("Robert j",56,"Sharp your mind",1999);



    }
}
