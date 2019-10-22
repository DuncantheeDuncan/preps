package objectOrientation;


class Book {
    public void books() {
        System.out.println("Book name: THE AVENGERS!!");
    }
}

class Chapters extends Book {
    public void chapters() {
        System.out.println("List of chapters");
        System.out.println("chapter1\nchapter2\nchapter3\nchapter4\n");
    }

}

class Topics extends Chapters {
    public void topics() {
        System.out.println("List of topics");
        System.out.println("topic1\ntopic2\ntopic3\ntopic4\ntopic5\n");
    }

}

class Pages extends Topics {
    public void pages() {
        System.out.println("this book have\n500 pages");
    }

}

public class PolymorphicMethod {
    public static void main(String[] args) {
        Book myBook = new Book();
        Chapters myChapters = new Chapters();
        Topics myTopics = new Topics();
        Pages myPages = new Pages();


//TODO      DownCasting
        System.out.println("*******DownCasting************");
        //TODO down-casting works!!
        Book b = new Pages();

        ((Pages) b).pages();


        Chapters chaptersss = new Topics();
        ((Topics) chaptersss).topics();


        Chapters chaPage = new Pages();
        ((Pages) chaPage).pages();


        ((Topics) chaPage).chapters();


        //TODO UpCasting
        System.out.println("*******UpCasting************\n");
        ((Chapters) myTopics).chapters();

        Book bk = new Pages();
//        bk.books();// can only see book, if book was
        // overridden on a subclass that book would be invoked!!

        //TODO: classCastException
        System.out.println("*******classCastException************\n");


        ((Topics) myChapters).topics();// classCastException


    }
}