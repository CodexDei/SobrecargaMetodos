public class SobrecargaMetodos {

    public static void main(String[] args) {
        System.out.println(" Respuesta 1: " + Calcular.suma(4, 1));
        System.out.println(" Respuesta 2: " + Calcular.suma(4L, 16L));
        System.out.println(" Respuesta 3: " + Calcular.suma(4, 16D));
        System.out.println(" Respuesta 4: " + Calcular.suma(3F, 'A'));
    }
}
