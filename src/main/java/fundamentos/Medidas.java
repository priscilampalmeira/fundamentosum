// Nome do Pacote
package fundamentos;

// Bibliotecas

import java.util.Scanner;

//Classe
public class Medidas {
    //Atributos - Características

    static Scanner entrada = new Scanner(System.in);


    //Metodos e funções
    public static void main(String[]args){
        String opcao;
        int area = 0;
        int areatriangulo;
        int arearetangulo;

        System.out.println("Escolha o cálculo Desejado");
        System.out.println("(1) Area do Quadrado");
        System.out.println("(2) Area do Triangulo");
        System.out.println("(3) Area do Retangulo");
        System.out.println("(4) Area do Circulo");

        opcao = entrada.nextLine();

        switch (opcao){
            case "1":
            area = calcularAreaDoQuadrado();
            break;
            case "2":
            areatriangulo = calcularAreaDoTriangulo();
            System.out.println("A area do triangulo é " + areatriangulo + " m2");
            break;
            case "3":
            arearetangulo = calcularAreaDoRetangulo();
            System.out.println("A area do retangulo é " + arearetangulo + " m2");
            break;
            default:
            System.out.println("Opção é inválida");

        }

        if (area > 0) {
            System.out.println("A area é " + area + "m2");
        }

    }

    public static int calcularAreaDoQuadrado(){
        int lado;

        System.out.println("Digite o tamanho do lado");
        lado = entrada.nextInt();
        return lado * lado;
    }


    public static int calcularAreaDoTriangulo(){

        int base;
        int altura;

        System.out.println("Digite o tamanho da base");
        base = entrada.nextInt();
        System.out.println("Digite o tamanho da altura");
        altura = entrada.nextInt();
        return base * altura / 2;
    }

    public static int calcularAreaDoRetangulo(){

        int baseretangulo;
        int alturaretangulo;

        System.out.println("Digite o tamanho da base");
        baseretangulo = entrada.nextInt();
        System.out.println("Digite o tamanho da altura");
        alturaretangulo = entrada.nextInt();
        return baseretangulo * alturaretangulo;

    }

    //public static int calcularAreaDoCirculo(){

      //  System.out.println("Digite o tamanho do raio");

    //}

}
