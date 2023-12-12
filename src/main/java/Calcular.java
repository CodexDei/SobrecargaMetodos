public class Calcular {

    public static int suma (int a, int b){
        System.out.print("Total int a, int b");
        return a + b;
    }
    
    public static double suma(double a, double b){
            System.out.print("Total double a, double b");
            return a + b;
    }
    public static double suma(double a, int b){
            System.out.print("Total double a, int b");
            return a + b;
    }
    
    private static double suma(double a, double b, double c){
            System.out.println("double a, double b");
            return a + b;
    }
    
}
