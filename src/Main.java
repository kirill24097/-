
public class Main {
   public static void main(String[] args) {
       Author author1 = new Author("name1", "Surname1");
       Author author2 = new Author("name2", "Surname2");

       Book book1 = new Book("Titel1", 2020, author1);
       Book book2 = new Book("Titel2", 2022, author2);
       System.out.println("имя автора: " + author1.getName() + "фамилия автора: " + author1.getSurname());
       System.out.println("имя автора: " + author2.getName() + "фамилия автора: " + author2.getSurname());

       System.out.println("Название книги: " + book1.getName() + ", год издания: " + book1.getYear() + ", автор книги: " + book1.getAuthor().getName());
       System.out.println("Название книги: " + book2.getName() + ", год издания: " + book2.getYear() + ", автор книги: " + book2.getAuthor().getName());
   }
}

