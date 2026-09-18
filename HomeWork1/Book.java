public class Book {
    public String title;
    public String pages;

    public Book(){
        title = "";
        pages = "";
    }

    public Book (String title, String pages){
        this.title = title;
        this.pages = pages;
    }

    public String toString(){
        return this.title;
    }
}
