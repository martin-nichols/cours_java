public class ExempleStringBuilder {
    public static void main(String[] args) {
        // Initialisation d'un StringBuilder avec une chaîne initiale
        StringBuilder sb = new StringBuilder("Bonjour le Monde !");
        StringBuilder vide = new StringBuilder();
        StringBuilder avecEspaces = new StringBuilder("   Texte avec espaces   ");

        // 1. Longueur et capacité
        // length() retourne le nombre de caractères, capacity() la taille du buffer
        System.out.println("Longueur de sb : " + sb.length());
        System.out.println("Capacité de sb : " + sb.capacity());

        // 2. Ajout de contenu
        // append() ajoute du contenu à la fin
        sb.append(" Bienvenue !");
        System.out.println("Après append : " + sb);

        // 3. Insertion
        // insert() insère du contenu à une position donnée
        sb.insert(7, " cher ");
        System.out.println("Après insert : " + sb);

        // 4. Remplacement
        // replace() remplace une portion de la chaîne
        sb.replace(8, 12, "monde");
        System.out.println("Après replace : " + sb);

        // 5. Suppression
        // delete() supprime une portion, deleteCharAt() supprime un caractère
        sb.delete(0, 7);
        System.out.println("Après delete : " + sb);
        sb.deleteCharAt(sb.length() - 1);
        System.out.println("Après deleteCharAt : " + sb);

        // 6. Inversion
        // reverse() inverse l'ordre des caractères
        sb.reverse();
        System.out.println("Après reverse : " + sb);
        sb.reverse(); // Remettre dans l'ordre initial
        System.out.println("Après second reverse : " + sb);

        // 7. Accès aux caractères
        // charAt() accède à un caractère, setCharAt() modifie un caractère
        System.out.println("Caractère à l'index 0 : " + sb.charAt(0));
        sb.setCharAt(0, 'C');
        System.out.println("Après setCharAt : " + sb);

        // 8. Extraction de sous-chaîne
        // substring() extrait une portion sans modifier l'original
        System.out.println("Sous-chaîne (0,5) : " + sb.substring(0, 5));
        System.out.println("Sous-chaîne à partir de 6 : " + sb.substring(6));

        // 9. Modification de la longueur
        // setLength() ajuste la longueur (tronque ou ajoute des caractères nuls)
        sb.setLength(10);
        System.out.println("Après setLength(10) : " + sb);
        sb.setLength(20); // Ajoute des caractères nuls
        System.out.println("Après setLength(20) : " + sb);

        // 10. Suppression des espaces
        // trimToSize() réduit la capacité au minimum nécessaire
        avecEspaces.trimToSize();
        System.out.println("Capacité après trimToSize : " + avecEspaces.capacity());

        // 11. Conversion en String
        // toString() convertit le StringBuilder en String
        String resultat = sb.toString();
        System.out.println("Conversion en String : " + resultat);

        // 12. Vérification si vide
        // Un StringBuilder est considéré vide si length() == 0
        System.out.println("Le StringBuilder vide est-il vide ? " + (vide.length() == 0));
        System.out.println("Le StringBuilder sb est-il vide ? " + (sb.length() == 0));

        // 13. Index de sous-chaîne
        // indexOf() et lastIndexOf() recherchent une sous-chaîne
        System.out.println("Position de 'monde' : " + sb.indexOf("monde"));
        System.out.println("Dernière position de 'e' : " + sb.lastIndexOf("e"));

        // 14. Ajout de différents types de données
        // append() peut ajouter des types variés (int, double, etc.)
        StringBuilder sb2 = new StringBuilder("Valeur : ");
        sb2.append(42).append(" et ").append(3.14);
        System.out.println("Ajout de types variés : " + sb2);

        // 15. Réinitialisation
        // setLength(0) vide le contenu
        sb.setLength(0);
        System.out.println("Après réinitialisation : " + sb);
    }
}