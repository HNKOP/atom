import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Scanner;

public class Main {


    private static final org.slf4j.Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {


        WordFinder wordFinder = new WordFinder("dictionary.txt");
        try {
            String word = wordFinder.getWord();
            log.info("оЫЛВирыфлврыфловрыфловрфыл");
            System.out.println("Вы играете в игру \"Быки и коровы\" \nВам нужно угадать слово из " + word.length() + " букв");
            String ans = "";
            int tries = 0;
            Scanner in = new Scanner(System.in);
            System.out.println(word);
            System.out.println("Введите слово");
            ans = in.nextLine();
            int bulls = 0;
            int cows = 0;

            while (!ans.equals(word) && tries != 10) {
                char[] ansChars = ans.toCharArray();
                char[] wordChars = word.toCharArray();
                char[] bufChars = wordChars;

                bulls = getBulls(ansChars, wordChars);
                cows = getCows(ansChars, wordChars);

                cows -= bulls;
                System.out.println("Быков: " + bulls + " Коров: " + cows);
                System.out.println("Введите слово");
                ans = in.nextLine();
                tries++;
            }

            if (tries == 10) {
                System.out.println("Вы проиграли");
            } else {
                System.out.println("Вы победили");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int getBulls(char[] ansChars, char[] wordChars) {
        int bulls = 0;
        for (int i = 0; i < wordChars.length; i++) {
            if (i < ansChars.length && wordChars[i] == ansChars[i]) {
                bulls++;
            }
        }
        return bulls;
    }

    public static int getCows(char[] ansChars, char[] wordChars) {
        int cows = 0;
        for (int i = 0; i < ansChars.length; i++) {
            for (int j = 0; j < wordChars.length; j++) {
                if (ansChars[i] == wordChars[j]) {
                    wordChars[j] = ' ';
                    cows++;
                    break;
                }
            }
        }
        return cows;
    }
}
