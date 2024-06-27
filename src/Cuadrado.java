public class Cuadrado implements Figura , Cuadrable {

    private double lado;

   public Cuadrado (){

   }

   public Cuadrado ( double lado){
   this.lado = lado;
   }

    @Override
    public double mostrarInfo() {
       double resultado = lado * lado;
       return resultado;

    }

    @Override
    public void cudrar() {
       System.out.println("El cuadrado no se puede dar un giro");
    
    }

    
}
