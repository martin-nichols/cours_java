class IfElseDemontration {
    public static void main(String[] args) {
        int resultat = 60;
        char note;
        if (resultat >= 90) {
            note = 'A';
        } else if (resultat >= 80) {
            note = 'B';
        } else if (resultat >= 70) {
            note = 'C';
        } else if (resultat >= 60) {
            note = 'D';
        } else {
            note = 'F';
        }
        System.out.println("Note finale = " + note);
    }
}