package objectOrientation;


class Book{
    public void books(){
        System.out.println("Book name: THE AVENGERS!!");
    }
}

class Chapters extends  Book{
    public void chapters(){
        System.out.println("List of chapters");
        System.out.println("chapter1\nchapter2\nchapter3\nchapter4\n");
    }

}

class Topics extends Chapters{
    public void topics(){
        System.out.println("List of topics");
        System.out.println("topic1\ntopic2\ntopic3\ntopic4\ntopic5\n");
    }

}

class Pages extends Topics{
    public void pages(){
        System.out.println("this book have\n500 pages");
    }
}

public class PolymorphicMethod {
    public static void main(String[] args) {
        Book myBook = new Book();
        Chapters myChapters = new Chapters();
        Topics myTopics = new Topics();
        Pages myPages = new  Pages();

//        casting
        ((Book)myChapters).books();
//        myPages.books();// no need to cast

//        ((Topics)myChapters).topics();// classCastException

        System.out.println(myChapters instanceof Pages);// false

        ((Chapters)myTopics).chapters();







    }
}