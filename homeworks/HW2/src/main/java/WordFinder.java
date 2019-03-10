import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class WordFinder {


    public String filename = "dictionary.txt";

    public WordFinder(String filename) {
        this.filename = filename;
    }

    public String getWord() throws IOException {

        Path path = Paths.get(filename);
        Scanner scanner = new Scanner(path);
        ArrayList<String> words = new ArrayList<>();
        while (scanner.hasNextLine()) {
            words.add(scanner.nextLine());
        }

        int randomIndex = ThreadLocalRandom.current().nextInt(0, words.size());

        return words.get(randomIndex);
    }
}
