class SwitchStringExemple {
    public static void main(String[] args) {
        String jour = "Mardi";
        String typeJour;
        switch (jour) {
            case "Lundi":
            case "Mardi":
            case "Mercredi":
            case "Jeudi":
            case "Vendredi":
                typeJour = "Jour ouvrable";
                break;
            case "Samedi":
            case "Dimanche":
                typeJour = "Week-end";
                break;
            default:
                typeJour = "Jour invalide";
                break;
        }
        System.out.println(jour + " est un " + typeJour);
    }
}
