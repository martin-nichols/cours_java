import java.util.Stack;

public class ExempleStack {
    public static void main(String[] args) {
        Stack<Integer> pile = new Stack<>();
        pile.push(22);
        pile.push(10);
        pile.push(20);
        pile.push(30);
        pile.push(333);
        System.out.println(pile.pop()); // Affiche 30
        System.out.println("Taille de la pile : " + pile.size());
        System.out.println(pile.peek()); // Affiche 20 (sans dépiler)
        System.out.println("Taille de la pile : " + pile.size());
        System.out.println(pile.pop());
        System.out.println("Taille de la pile : " + pile.size());
        System.out.println(pile.pop());
        System.out.println("Taille de la pile : " + pile.size());
        System.out.println(pile.pop());
        System.out.println("Taille de la pile : " + pile.size());
        System.out.println(pile.peek());
        System.out.println("Taille de la pile : " + pile.size());
        System.out.println(pile.peek());
    }
}