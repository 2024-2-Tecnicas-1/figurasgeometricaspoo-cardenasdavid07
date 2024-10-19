package com.mycompany.figurasgeometricas;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese el nombre de la figura:");
            String nombre = scanner.nextLine();
            
            System.out.println("Ingrese el color de la figura:");
            String color = scanner.nextLine();
            
            System.out.println("Ingrese el tipo de figura (1: Circulo, 2: Rectangulo, 3: Triangulo):");
            int tipoFigura = scanner.nextInt();
            
            FiguraGeometrica figura = null;
            
            switch (tipoFigura) {
                case 1:
                    System.out.println("Ingrese el radio del circulo:");
                    double radio = scanner.nextDouble();
                    figura = new Circulo(nombre, color, radio);
                    break;
                case 2:
                    System.out.println("Ingrese el valor del lado 1 del rectangulo:");
                    double lado1 = scanner.nextDouble();
                    System.out.println("Ingrese el valor del lado 2 del rectangulo:");
                    double lado2 = scanner.nextDouble();
                    figura = new Rectangulo(nombre, color, lado1, lado2);
                    break;
                case 3:
                    System.out.println("Ingrese el valor de la base del triangulo:");
                    double base = scanner.nextDouble();
                    System.out.println("Ingrese el valor de la altura del triangulo:");
                    double altura = scanner.nextDouble();
                    figura = new Triangulo(nombre, color, base, altura);
                    break;
                default:
                    System.out.println("Tipo de figura no valido.");
                    break;
            }
            
            if (figura != null) {
                System.out.println("Area de la figura: " + figura.obtenerArea());
                System.out.println("Perimetro de la figura: " + figura.obtenerPerimetro());
            }
        }
    }
}

    

    
   
  

