import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
    System.out.println("Lab 1 Java");
    System.out.println("Select the task by 1 for 4:");
    int choice = s.nextInt();
    switch (choice) {
        case 1: {
            First();
            break;
        }
        case 2: {
            Second();
            break;
        }
        case 3: {
            Third();
            break;
        }
        case 4: {
            Fourth();
            break;
        }
        default: {
            System.out.print("Pleas enter normal number:");
            break;
        }
    }
    }


public static void First() {

}
public static void Second() {

}
public static void Third(){

}
public static void Fourth() {

}

}