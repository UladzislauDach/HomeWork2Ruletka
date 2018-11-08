import java.util.Scanner;

public class igra {
    public static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public static void main(String... args) {
        System.out.println("Игра в рулетку! Выберете количество выстрелов: 1, 2 или 3");
        Scanner b = new Scanner(System.in);
        int vistrelNumber = b.nextInt();
        System.out.println("Введите любое число от 1 до 6");
        int ochki = 0; //переманная очков
        Scanner userNumber = new Scanner(System.in);
        switch (vistrelNumber) {

            case 1:

                while (true) {
                    int a = userNumber.nextInt();
                    final int rnd = rnd(1, 6);
                    if (a != rnd) {
                        ochki++; //счётчик очков
                        System.out.println("Вы выйграли =) " + a + "!=" + rnd + " Количество очков " + ochki);
                    } else {
                        System.out.println("Вы проиграли =( " + a + "==" + rnd + " Количество очков " + ochki);
                        break;
                    }


                }
            case 2:
                while (true) {
                    int a = userNumber.nextInt();
                    final int rnd = rnd(1, 6);
                    final int rnd2 = rnd(1, 6);
                    if (a != rnd && a != rnd2) {
                        ochki++; //счётчик очков
                        System.out.println("Вы выйграли =) " + a + "!=" + rnd + rnd2 + " Количество очков " + ochki);
                    } else {
                        System.out.println("Вы проиграли =( " + a + "==" + rnd + rnd2 + " Количество очков " + ochki);
                        break;
                    }

                }
            case 3:
                while (true) {
                    int a = userNumber.nextInt();
                    final int rnd = rnd(1, 6);
                    final int rnd2 = rnd(1, 6);
                    final int rnd3 = rnd(1, 6);
                    if (a != rnd && a != rnd2 && a != rnd3) {
                        ochki++; //счётчик очков
                        System.out.println("Вы выйграли =) " + a + "!=" + rnd + rnd2 + rnd3 + " Количество очков " + ochki);
                    } else {
                        System.out.println("Вы проиграли =( " + a + "==" + rnd + rnd2 + rnd3 + " Количество очков " + ochki);
                        break;
                    }

                }
        }

    }
}
