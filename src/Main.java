import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int year = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Bir yıl giriniz :");
        year = input.nextInt();


        if ( (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0) ) {

            System.out.println(year + " Bir artık yıldır!");
        } else {
            System.out.println(year + " Bir artık yıl değildir!");
        }
    }
}





