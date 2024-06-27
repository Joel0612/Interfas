public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Cuadrado cuadrado = new Cuadrado(7);
       
        System.out.println("El lado del cuadrado es: " +  cuadrado.mostrarInfo());
        cuadrado.cudrar();
    }
}
