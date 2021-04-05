public class Test {
    public static void main(String[] args) {
        Book book1 = new Book("Throne", "Jan Sensero", new String[500], 2012);
        Book book2 = new Book("Throne1", "Jan Sensero", new String[350], 2015);

        System.out.println(book1.equals(book2));
        System.out.println(book1.hashCode() == book2.hashCode());
    }
}