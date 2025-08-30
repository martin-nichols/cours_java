class SwitchExemple {
    public static void main(String[] args) {
        double TauxCommission;
        int cas = 2;
        switch (cas) {
            case 1:
                TauxCommission = 0.02;
                break;
            case 2:
                TauxCommission = 0.035;
                break;
            case 3:
                TauxCommission = 0.05;
                break;
            default:
                TauxCommission = 0.0;
                break;
        }
        System.out.printf("Le taux de commission est de %.2f Piastres$$$, pas une crisse de cenne de plus.%n", TauxCommission * 100);
// ou 2 décimales : %.2f%%  -> 3.50%

    }
} 