package patterns.c_behavioral.iterators;

import patterns.c_behavioral.iterators.example1.MyIterator;
import patterns.c_behavioral.iterators.example1.Product;
import patterns.c_behavioral.iterators.example1.ProductCollection;
import patterns.c_behavioral.iterators.example2.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IteratorDemo {

    public static Scanner scanner = new Scanner(System.in);

    public static List<Profile> createProfiles() {
        List<Profile> data = new ArrayList<>();
        data.add(new Profile("anna.smith@bing.com", "Anna Smith", "friends:mad_max@ya.com", "friends:catwoman@yahoo.com", "coworkers:sam@amazon.com"));
        data.add(new Profile("mad_max@ya.com", "Maximilian", "friends:anna.smith@bing.com", "coworkers:sam@amazon.com"));
        data.add(new Profile("bill@microsoft.eu", "Billie", "coworkers:avanger@ukr.net"));
        data.add(new Profile("avanger@ukr.net", "John Day", "coworkers:bill@microsoft.eu"));
        data.add(new Profile("sam@amazon.com", "Sam Kitting", "coworkers:anna.smith@bing.com", "coworkers:mad_max@ya.com", "friends:catwoman@yahoo.com"));
        data.add(new Profile("catwoman@yahoo.com", "Liza", "friends:anna.smith@bing.com", "friends:sam@amazon.com"));
        return data;
    }

    public static void main(String[] args) {

        System.out.println("--------EXAMPLE 1---------");
        ProductCollection collection = new ProductCollection();
        collection.add(new Product("computer1", BigDecimal.valueOf(2500)));
        collection.add(new Product("computer2", BigDecimal.valueOf(3800)));
        collection.add(new Product("computer3", BigDecimal.valueOf(4900)));
        Product product1 = new Product("computer4", BigDecimal.valueOf(50000));
        collection.add(product1);
        collection.remove(product1);

        MyIterator<Product> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("--------EXAMPLE 2---------");
        boolean rightPick = false;
        SocialNetwork network = null;
        do {
            System.out.println("Please pick social network: \n1. Facebook\n2. LinkedIn");
            String choice = scanner.nextLine();
            if (choice.equals("1")) {
                network = new Facebook(createProfiles());
            } else if (choice.equals("2")) {
                network = new LinkedIn(createProfiles());
            } else {
                System.out.println("Wrong choice, try again.");
            }
            if (network != null) {
                rightPick = true;
            }
        } while (!rightPick);
        SocialSpammer spammer = new SocialSpammer(network);
        spammer.sendSpamToFriends("anna.smith@bing.com",
                "Hey! This is Anna's friend Josh. Can you do me a favor and like this post [link]?");
        spammer.sendSpamToCoworkers("anna.smith@bing.com",
                "Hey! This is Anna's boss Jason. Anna told me you would be interested in [link].");


    }
}
