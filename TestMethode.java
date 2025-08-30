public class TestMethode {
    
    public static void test(String test)
    {
        test = test+test;
        System.out.println(test);
    } 
    
    public static void main(String[] args) {
        
        String chaine ="test";
        
        test(chaine);
        
        System.out.println(chaine);

    }
    
}