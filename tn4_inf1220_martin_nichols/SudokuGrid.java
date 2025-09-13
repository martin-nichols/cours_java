package tn4_inf1220_martin_nichols;


import java.util.Arrays;


class SudokuGrid {
private final int[][] cells = new int[9][9]; // 0 = vide, 1..9 = valeurs valides


SudokuGrid() {
for (int i = 0; i < 9; i++) {
Arrays.fill(cells[i], 0);
}
}


void put(int x, int y, int z) {
if (x < 0 || x > 8 || y < 0 || y > 8) {
throw new InvalidIndexException("Indice hors plage (" + x + "," + y + ")");
}
if (z < 1 || z > 9) {
throw new InvalidValueException("Valeur hors plage z=" + z + " en (" + x + "," + y + ")");
}
if (cells[x][y] != 0 && cells[x][y] != z) {
throw new DuplicateCellConflictException("Conflit à (" + x + "," + y + "): " + cells[x][y] + " vs " + z);
}
cells[x][y] = z; // autorise redondance identique; sinon supprimer la condition ci-dessus
}


int get(int x, int y) { return cells[x][y]; }


SudokuGrid transpose() {
SudokuGrid t = new SudokuGrid();
for (int i = 0; i < 9; i++) {
for (int j = 0; j < 9; j++) {
int v = cells[i][j];
if (v != 0) t.cells[j][i] = v;
}
}
return t;
}


/** Retourne une chaîne 9 lignes × 9 valeurs ("." pour 0) */
String render() {
StringBuilder sb = new StringBuilder();
for (int i = 0; i < 9; i++) {
for (int j = 0; j < 9; j++) {
int v = cells[i][j];
sb.append(v == 0 ? '.' : (char)('0' + v));
if (j < 8) sb.append(' ');
}
sb.append('\n');
}
return sb.toString();
}


/** Vérifie s'il reste des 0 (grille incomplète). */
boolean isComplete() {
for (int i = 0; i < 9; i++) {
for (int j = 0; j < 9; j++) {
if (cells[i][j] == 0) return false;
}
}
return true;
}
}