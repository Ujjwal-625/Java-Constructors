public class Product {
    //instance variable
    String productName;
    int price;

    static int totalProducts;//class or static variable

    Product(String ProductName,int price){
        this.price=price;
        this.productName=ProductName;
        totalProducts++;
    }

    void displayTotalProducts(){
        System.out.println("total products "+totalProducts);
    }

    void diplayProductDetails(){
        System.out.println("Product Name "+productName);
        System.out.println("Product Price "+price);
    }

    public static void main(String[] args) {
        Product p1=new Product("kdfjlkds",109);
        p1.diplayProductDetails();
        p1.displayTotalProducts();
        Product p2=new Product("dfkjslfk",980);
        p2.diplayProductDetails();
        p2.displayTotalProducts();
    }
}
