import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main level = new Main();
        level.runlevel();
    }

    public void runlevel() {
        System.out.println("Enter level: ");
        Scanner scanner = new Scanner(System.in);
        int level = scanner.nextInt();
        switch ((int) level) {
            case 1:
                System.out.print("Please enter number ");
                int numberLevel_1 = scanner.nextInt();
                System.out.println("You enter number: " + numberLevel_1);
                int ruletka1 = ruletka_1(numberLevel_1);
                break;
            case 2:
                System.out.print("Please enter number ");
                int numberLevel_2 = scanner.nextInt();
                System.out.println("You enter number: " + numberLevel_2);
                int ruletka2 = ruletka_2(numberLevel_2);
                break;
            case 3:
                System.out.print("Please enter number ");
                int numberLevel_3 = scanner.nextInt();
                System.out.println("You enter number: " + numberLevel_3);
                int ruletka3 = ruletka_3(numberLevel_3);
                break;
            default:
                System.out.println("Error level.");
        }
    }

    public static int ruletka_1(int numberLevel_1) {
        int s = 0;
        while (true) {
            int[] mas = new int[1];
            mas[0] = (int) (1 + (Math.random() * 6));
            System.out.println(mas[0]);
            if (mas[0] == numberLevel_1) {
                System.out.println("You lose, game over ");
                System.out.println("Total wins: " + s);
                break;
            } else {
                System.out.println("You win, play again!");
                s++;
            }
        }
        return numberLevel_1;
    }

    public static int ruletka_2(int numberLevel_2) {
        int s = 0;
        while (true) {
            int[] mas = new int[2];
            mas[0] = (int) (1 + (Math.random() * 6));
            mas[1] = (int) (1 + (Math.random() * 6));
            System.out.println(mas[0]);
            System.out.println(mas[1]);
            if (mas[0] == numberLevel_2 || mas[1] == numberLevel_2) {
                System.out.println("You lose, game over ");
                System.out.println("Total wins: " + s);
                break;
            } else {
                System.out.println("You win, play again!");
                s++;
            }
        }
        return numberLevel_2;
    }

    public static int ruletka_3(int numberLevel_3) {
        int s = 0;
        while (true) {
            int[] mas = new int[3];
            mas[0] = (int) (1 + (Math.random() * 6));
            mas[1] = (int) (1 + (Math.random() * 6));
            mas[2] = (int) (1 + (Math.random() * 6));
            System.out.println(mas[0]);
            System.out.println(mas[1]);
            System.out.println(mas[2]);
            if (mas[0] == numberLevel_3 || mas[1] == numberLevel_3 || mas[2] == numberLevel_3) {
                System.out.println("You lose, game over ");
                System.out.println("Total wins: " + s);
                break;
            } else {
                System.out.println("You win, play again!");
                s++;
            }
        }
        return numberLevel_3;
    }
}
