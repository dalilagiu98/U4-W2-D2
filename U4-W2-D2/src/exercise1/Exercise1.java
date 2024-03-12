package exercise1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, insert a integer N that will be the number of words to insert");
        int numberInserted = Integer.parseInt(scanner.nextLine());
        //I create a set of String type because of the content of the set
        Set<String> stringSet = new HashSet<>();
        Set<String> stringSetDuplicate = new HashSet<>();

        if(numberInserted > 0) {

            for (int i = 0; i < numberInserted; i++) {
                System.out.println("Please, insert your " + (i + 1) + " word");
                String stringInserted = scanner.nextLine();
                if (stringSet.add(stringInserted)) {
                    stringSet.add(stringInserted);
                } else {
                    stringSetDuplicate.add(stringInserted);
                }

            }

            System.out.println("The words you have inserted are: " + stringSet);
            System.out.println("The number of words you have inserted is: " + stringSet.size());
            System.out.println("The duplicate are: " + stringSetDuplicate);
            scanner.close();

        } else {
            System.err.println("Insert a number greater than zero!");
        }
    }
}
