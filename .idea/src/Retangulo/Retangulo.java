package Retangulo;

public class Retangulo {
    double ladoA;
    double ladoB;

    public Retangulo() {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    public void alteraValorLados(){
        System.out.println("alteraValorLados");
    }
    public double calcularPerimetro(){
        double total;
        total = 2 * (ladoA + ladoB);
        return total;
    }
    public String mostrarLados(double ladoA, double ladoB){
        System.out.println("mostrar lado A  = " + this.ladoA + " Lado B " + this.ladoB);
        return null;
    }

}
