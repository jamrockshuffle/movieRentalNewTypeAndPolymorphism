package example;

import example.price.ChildrensPrice;
import example.price.NewReleasePrice;
import example.price.RegularPrice;
import example.price.ScifiPrice;

import java.util.List;


public class Main {
    public static final Movie REMBO = new Movie("Rembo", new RegularPrice());
    public static final Movie LOTR = new Movie("Lord of the Rings", new NewReleasePrice());
    public static final Movie HARRY_POTTER = new Movie("Harry Potter", new ChildrensPrice());
    public static final Movie SPACE_ODYSSEY = new Movie("Space Odyssey 2001", new ScifiPrice());

    public static void main(String[] args) {
        List<Rental> rentals = List.of(new Rental(REMBO, 1),
                new Rental(LOTR, 4),
                new Rental(HARRY_POTTER, 5),
                new Rental(SPACE_ODYSSEY, 2));

        String statement = new Customer("John Doe", rentals).statement();

        System.out.println(statement);
    }
}
