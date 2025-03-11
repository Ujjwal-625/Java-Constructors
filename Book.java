public class Book {
    String title,author;
    int price;
    Book(){
        title="ABC";
        author="ABC";
        price=908;
    }

    Book(String title,String author,int price){
        this.title=title;
        this.price=price;
        this.author=author;
    }

    void Display()
    {
        System.out.println("Title "+title);
        System.out.println("Author "+author);
        System.out.println("price "+price);
    }

    public static void main(String[] args) {
        Book b=new Book();

        Book b1=new Book("parametrize","Parametrize",9087);

        b.Display();
        b1.Display();
    }

}
