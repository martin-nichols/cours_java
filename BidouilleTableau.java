public class BidouilleTableau {
    public static void main(String[] args){
        int[] nombres = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        System.out.println(nombres[5]);
        int[] chiffres = nombres;
        System.out.println(nombres[5] +", " + chiffres[2]);
    }
}
