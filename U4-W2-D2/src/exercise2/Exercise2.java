package exercise2;

import java.util.*;

public class Exercise2 {
    //FUNCTIONS THAT ACCEPTS A INTEGER N AND RETURNS AN ORDERED LIST OF N RANDOM INTEGERS FROM 0 TO 100:
    public static List<Integer> getRandomList(int n) {
        List<Integer> randomIntegerList = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < n; i++) {
            randomIntegerList.add(random.nextInt(0, 101));
        }
        Collections.sort(randomIntegerList); //to sort the content of ArrayList I use the method sort of the Collections
        return randomIntegerList;
    }

    //FUNCTION THAT ACCEPTS A LIST AND RETURNS A NEW LIST COMPOSED OF THE ELEMENTS OF THE FIRST LIST FOLLOWED BY THE SAME ELEMENTS ARRANGED IN REVERSE ORDER:
    //(For convenience, I will use the list of integers defined previously)
    public static List<Integer> getReverseList(List<Integer> list){
        List<Integer> newReverseList = new ArrayList<>(list);
        for (int i = list.size() - 1; i >= 0; i-- ) {
            newReverseList.add(list.get(i));
        }
        return newReverseList;
    }


    //FUNCTION THAT ACCEPTS A LIST AND A BOOLEAN: IF BOOLEAN IS TRUE PRINT VALUES IN EVEN POSITION, ELSE PRINT VALUES IN ODD POSITION:
    //(For convenience, I will use the list of integers defined previously)
    public static void evenOddPosition(List<Integer> list, boolean answer) {
        for( int i = (answer? 0 : 1); i < list.size(); i+= 2 ) {
            System.out.println(list.get(i));
        }
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("Please, insert a integer for the element and press Enter:");
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> integerList = getRandomList(n);
        System.out.println("----------------------- FIRST FUNCTION------------------------");
        System.out.println("The list is: " + integerList);
        System.out.println("----------------------- SECOND FUNCTION------------------------");
        List<Integer> reverseList = getReverseList(integerList);
        System.out.println("The reverse list is: " + reverseList);
        System.out.println("You want to print the integer in the even or odd position? Answer E/O and press Enter");
        String answer = scanner.nextLine().toUpperCase();
        if (answer.equals("E")){
            System.out.println("----------------------- THIRD FUNCTION------------------------");
            evenOddPosition(reverseList, true);
        } else if (answer.equals("O")) {
            System.out.println("----------------------- THIRD FUNCTION------------------------");
            evenOddPosition(reverseList, false);
        } else {
            System.err.println("Insert E or O!");
        }

        scanner.close();
    }
}
