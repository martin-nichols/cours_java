package tn4_inf1220_martin_nichols;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;


class SudokuParser {
SudokuGrid parse(Reader r) throws IOException {
SudokuGrid grid = new SudokuGrid();
BufferedReader br = new BufferedReader(r);
String line;
int tokenCount = 0;


while ((line = br.readLine()) != null) {
if (line.trim().isEmpty()) continue;
String[] tokens = line.trim().split("\\s+");
for (String tok : tokens) {
if (tok.isEmpty()) continue;
if (tok.length() != 3 || !isAllDigits(tok)) {
throw new InvalidTokenFormatException("Token invalide: '" + tok + "' (attendu 3 chiffres xyz)");
}
int x = tok.charAt(0) - '0';
int y = tok.charAt(1) - '0';
int z = tok.charAt(2) - '0';
grid.put(x, y, z);
tokenCount++;
}
}


if (!grid.isComplete()) {
throw new IncompleteGridException("Grille incomplète après parsing (" + tokenCount + " triplets lus)");
}
return grid;
}


private boolean isAllDigits(String s) {
for (int i = 0; i < s.length(); i++) {
char c = s.charAt(i);
if (c < '0' || c > '9') return false;
}
return true;
}
}