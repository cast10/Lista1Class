package Bola;

import java.util.Scanner;
public class Bola {

    double circuferencia;
    String cor;
    String marca;
    double velocidade;
    String material;

    public Bola(){
        this.circuferencia = circuferencia;
        this.cor = "branca";
        this.marca = marca;
        this.velocidade = velocidade;
        this.material = material;
    }

    public String mostraCor( String cor){
        System.out.println(cor);
        return cor;
    }

    public void trocaCor(){
        System.out.println(cor);
        Scanner input = new Scanner(System.in);
        System.out.println("Coloque a cor");
        cor=input.next();
        System.out.println("A cor da sua bola agora é " + cor);
    }
}
