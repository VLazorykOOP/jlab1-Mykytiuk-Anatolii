import java.util.Arrays;
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
        s.close();
    }

    public static void First() {
        Scanner s = new Scanner(System.in);
        System.out.println("Select variant of data:");
        System.out.println("Input valid type, result - valid");
        System.out.println("Input integer type, result - valid ");
        System.out.println("Input valid type, result - integer");
        int choice = s.nextInt();
        switch (choice) {
            case 1: {
                float x, y;
                System.out.println("Input x");
                x = s.nextFloat();
                System.out.println("Input y");
                y = s.nextFloat();
                // Перевірка //
                if (x == 0 || y == 0) {
                    throw new IllegalArgumentException("Error: The denominator is equal 0.");
                } else {
                    float res = ((2 * x * x + x * y) / (x * y) * (x * y))
                            + (((3 * x * y) - (y * y * y)) / (x * x) + (2 * y * y));
                    System.out.println("Option 1: " + res);
                    break;
                }
            }
            case 2: {
                int x, y;
                System.out.println("Enter x");
                x = s.nextInt();
                System.out.println("Enter y");
                y = s.nextInt();
                if (x == 0 || y == 0) {
                    throw new IllegalArgumentException("Error: The denominator is equal 0.");
                } else {
                    float res = ((2 * x * x + x * y) / (x * y) * (x * y))
                            + (((3 * x * y) - (y * y * y)) / (x * x) + (2 * y * y));
                    System.out.println("Option 2: " + res);
                    break;
                }
            }
            case 3: {
                float x, y;
                System.out.println("Enter x");
                x = s.nextFloat();
                System.out.println("Enter y");
                y = s.nextFloat();
                if (x == 0 || y == 0) {
                    throw new IllegalArgumentException("Error: The denominator is equal 0.");
                } else {
                    float res = ((2 * x * x + x * y) / (x * y) * (x * y))
                            + (((3 * x * y) - (y * y * y)) / (x * x) + (2 * y * y));
                    int result = (int) res;
                    System.out.println("Option 3: " + result);
                    break;
                }
            }
            default: {
                System.out.print("Please input normal number");
                break;
            }
        }
        s.close();
    }

    public static void Second() {

        Scanner s = new Scanner(System.in);

        System.out.print("Input n please: ");
        int n = s.nextInt();

        int[] array = new int[n];

        System.out.println("Input elements of array: ");
        for (int i = 0; i < n; i++) {
            array[i] = s.nextInt();
        }

        System.out.print("Input k: ");
        int k = s.nextInt();

        for (int i = 0; i < k; i++) {
            int temp = array[array.length - 1 - i];
            for (int j = array.length - 1; j > i; j--) {
                array[j] = array[j - 1];
            }
            array[i] = temp;
        }

        System.out.println(Arrays.toString(array));
        s.close();
    }

    public static void Third() {
        Scanner s = new Scanner(System.in);

        System.out.print("Input n: ");
        int n = s.nextInt();

        double[][] array = new double[n][n];

        System.out.println("Input elements of array: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "][" + j + "]=");
                array[i][j] = s.nextDouble();
            }
        }

        double sumOfMainDiagonal = 0;
        for (int i = 0; i < n; i++) {
            sumOfMainDiagonal += array[i][i];
        }

        double sumOfUpperDiagonal = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i][j] > array[j][i]) {
                    sumOfUpperDiagonal += array[i][j];
                }
            }
        }
        double result = sumOfMainDiagonal + sumOfUpperDiagonal;

        // Виводимо результати.
        if (sumOfUpperDiagonal > 0) {
            System.out.println("summ on main diagonal: " + sumOfMainDiagonal);
            System.out.println("summ under main diagonal: " + sumOfUpperDiagonal);
            System.out.println("result:" + result);
        } else {
            System.out.println("errorchik.");
        }
        s.close();
    }

    public static void Fourth() {
        Scanner s = new Scanner(System.in);
        System.out.println("Input text:");
        String text = s.nextLine();
        String[] words = text.split("[ ,.:;-?!]+");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() % 2 == 1) {
                words[i] = "";
            }
        }
        String newText = "";
        for (String word : words) {
            newText += word + " ";
        }
        System.out.println("new text: " + newText);
        s.close();
    }
}
