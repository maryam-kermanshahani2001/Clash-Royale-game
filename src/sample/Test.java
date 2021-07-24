package sample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * The type Test.
 */
public class Test {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        try {
            System.out.println("Files.Paths.get(\".\").toAbsolutePath() = " + Files.list(Paths.get("./src/sample/controller").toAbsolutePath()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        ;
    }
}
