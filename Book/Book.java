package Book;


public class Book {
    //client
    private String Title;
    private String Author;
    private double Prices;

    public Book(String Title,String Author,double Prices){
        this.Title=Title;
        this.Author=Author;
        this.Prices=Prices;

    }
    public String getTitle(){ return Title;}
    public String getAuthor( ){ return Author;}

    public double getPrices () {return Prices;}

    public void addBook(Book book) {
        book.addBook(book);
    }



    public void displayBooks() {
    }

    public void viewBookPrices() {
    }

    public void purchaseBook(String title) {
    }


    }






