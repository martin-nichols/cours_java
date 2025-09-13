package tn4_inf1220_martin_nichols;


import javax.swing.*;
import java.io.*;
import java.nio.charset.StandardCharsets;


public class SudokuTN4 {
public static void main(String[] args) {
File file = null;
try {
if (args.length > 0) {
file = new File(args[0]);
} else {
// Boîte de dialogue si aucun argument
JFileChooser chooser = new JFileChooser();
chooser.setDialogTitle("Sélectionner un fichier de Sudoku (triplets xyz)");
int result = chooser.showOpenDialog(null);
if (result == JFileChooser.APPROVE_OPTION) {
file = chooser.getSelectedFile();
} else {
System.err.println("Aucun fichier sélectionné. Fin.");
System.exit(1);
}
}


if (file == null || !file.isFile()) {
System.err.println("Fichier invalide: " + (file == null ? "null" : file.getAbsolutePath()));
System.exit(2);
}


SudokuParser parser = new SudokuParser();
SudokuGrid grid;
try (Reader r = new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8))) {
grid = parser.parse(r);
}


// Validation stricte (lignes/colonnes = 1..9, exactement une fois)
SudokuValidator validator = new SudokuValidator();
validator.validate(grid);


// Affichage
System.out.println("=== Grille originale ===");
System.out.println(grid.render());


SudokuGrid transposed = grid.transpose();
System.out.println("=== Transposée (A^T) ===");
System.out.println(transposed.render());


} catch (InvalidTokenFormatException | InvalidIndexException | InvalidValueException |
DuplicateCellConflictException | IncompleteGridException | InvalidSudokuException e) {
System.err.println("Erreur: " + e.getMessage());
System.exit(3);
} catch (IOException e) {
System.err.println("Erreur de lecture du fichier: " + e.getMessage());
System.exit(4);
}
}
}