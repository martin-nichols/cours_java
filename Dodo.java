import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class Dodo{

public static void main(String[] args) {
  try {
    Path chemin = Path.of("D:/Martin/Teluq/ADM1400_TN2_martin_nichols.docx");
    Files.lines(chemin)
          .forEach(ligne -> System.out.println("Lue : " + ligne));
  } catch (IOException e) {
    System.out.println("Erreur de lecture : " + e.getMessage());
  }
}
}