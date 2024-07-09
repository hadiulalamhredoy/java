import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Exercise 1
        /*
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide year in Bangla calender");

        int year = sc.nextInt();

        switch (year % 12){
            case 0:
                System.out.println("Summer");
                break;
            case 1:
                System.out.println("Rainy");
                break;
            case 2:
                System.out.println("Cold");
                break;
            case 3:
                System.out.println("Nothing");

        }
         */
        /*
        for(int i = 0; i<10; i++){
            System.out.println((int)(670 + 30*Math.random()));
        }*/

        //Exercise 3

        String message = " Welcome to Java ";
        char ch = message.charAt(12);
        int index = message.indexOf("o");
        String trim = message.trim();

        System.out.println(ch);
        System.out.println(index);
        System.out.println(trim);

    }
}