package tn4_inf1220_martin_nichols;

class SudokuValidator {
    void validate(SudokuGrid grid) {
        // Vérification des lignes
        for (int i = 0; i < 9; i++) {
            boolean[] seen = new boolean[10]; // indices 1..9
            for (int j = 0; j < 9; j++) {
                int v = grid.get(i, j);
                if (v < 1 || v > 9) {
                    throw new InvalidSudokuException("Valeur invalide en ligne " + i + ", col " + j + " : " + v);
                }
                if (seen[v]) {
                    throw new InvalidSudokuException("Doublon en ligne " + i + " : " + v);
                }
                seen[v] = true;
            }
        }

        // Vérification des colonnes
        for (int j = 0; j < 9; j++) {
            boolean[] seen = new boolean[10]; // indices 1..9
            for (int i = 0; i < 9; i++) {
                int v = grid.get(i, j);
                if (v < 1 || v > 9) {
                    throw new InvalidSudokuException("Valeur invalide en colonne " + j + ", ligne " + i + " : " + v);
                }
                if (seen[v]) {
                    throw new InvalidSudokuException("Doublon en colonne " + j + " : " + v);
                }
                seen[v] = true;
            }
        }
    }
}
