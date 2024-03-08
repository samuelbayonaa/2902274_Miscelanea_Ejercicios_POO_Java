package co.edu.sena_2902274;

import java.util.Scanner;

public class main{
  public static void main(String[] args) {

            Scanner scr = new Scanner(System.in);

    double d1;  
    double d2;
    double d3;
    double d4;
    String resultado;
    int mis;
    //Todo menú y submenús

    Ejercicios ejercicios = new Ejercicios();

        System.out.println("Menu Miscelanea de Ejercicios Java");
        System.out.println("1 Operadores");
        System.out.println("2 Condiciones");
        System.out.println("3 Ciclos");
        System.out.println("4 Arreglos");
        System.out.println("99 Salir");
        System.out.println("Seleccione un Submenu" );

        mis= scr.nextInt();
    switch (mis) {
        //1 Operadores
        case 1:
        System.out.println("Haz seleccionado el Submenu de operadores: ");
        System.out.println( "1.1 Calcular el área de un triangúlo" );
        System.out.println("Ingrese la base del triángulo: ");
        d1 = scr.nextDouble();
        System.out.println("Ingrese la altura del triángulo: ");
        d2 = scr.nextDouble();
        d3 = ejercicios.areaTriangulo(d1, d2);
        System.out.println("El área del triángulo es: " + d3);

        System.out.println("1.2 Sumar dos números" );
        System.out.println("Ingrese un número: ");
        d1 = scr.nextDouble();
        System.out.println("Ingrese el otro número: ");
        d2 = scr.nextDouble();
        d3 = ejercicios.sumaNumeros(d1, d2);
        System.out.println("La suma de los números es: " + d3);

        System.out.println("1.3 Número al cuadrado" );
        System.out.println("Ingrese un número: ");
        d1 = scr.nextDouble();
        d2 = ejercicios.numeroCuadrado(d1);
        System.out.println("El número al cuadrado es: " + d2);

        System.out.println("1.4 Conversioón Euros a Dolares" );
        System.out.println("Ingrese el valor del Euro: ");
        d1 = scr.nextDouble();
        d2 = ejercicios.conversionE(d1);
        System.out.println("El valor del Euro al Dolar es: " + d2);

        System.out.println("1.5 Valor del Área y Perímetro de un Cuadrado" );
        System.out.println("Ingrese el valor de los cuadrados: ");
        d1 = scr.nextDouble();
        d2 = ejercicios.valorA(d1);
        System.out.println("El valor del Área es: " + d2);
        d3 = ejercicios.valorP(d1);
        System.out.println("El valor del Perímetro es: " + d3);

        System.out.println("1.6 Área y Volúmen de un Cilindro" );
        System.out.println("Ingrese el radio de la base del cilindro: ");
        d1 = scr.nextDouble();
        System.out.println("Ingrese la altura del cilindro: ");
        d2 = scr.nextDouble();
        d3 = ejercicios.areaC(d1, d2);
        System.out.println("El area del cilindro es: " + d3);
        d4 = ejercicios.volumenC(d1,d2);
        System.out.println("El volumen del cilindro es: " + d4);

        System.out.println("1.7 Longitud y Área de una Circurferencia ");
        System.out.println("Ingrese el Radio de la Circunferencia: ");
        d1 = scr.nextDouble();
        d2 = ejercicios.longitudCirculo(d1);
        System.out.println("La longitud del Circulo es: ");
        d3 = ejercicios.areaCirculo(d1);
        System.out.println("EL área del Circulo es: ");

        System.out.println("1.8 Promedio de tres Números" );
        System.out.println("Ingrese un número: ");
        d1 = scr.nextDouble();
        System.out.println("Ingrese otro Número: ");
        d2 = scr.nextDouble();
        System.out.println("Ingrese otro Número: ");
        d3 = scr.nextDouble();
        d4 = ejercicios.promedioN(d1, d2, d3);
        System.out.println("El promedio de los números digitados es: " + d4);
        
        break;
        case 2: 

        //2 Condicionales
        System.out.println("Haz selecciona el Submenu de condicionales");

        System.out.println("2.1 Determine si es positivo o negativo");
        System.out.println("Ingrese un numero:");
        d1 = scr.nextDouble();
        resultado = ejercicios.positivoNegativo(d1);
        System.out.println("Su numero es: " + resultado);
        
        System.out.println("2.2 Determinar si un numero es mayor o menor");
        System.out.println("Ingrese un numero:");
        d1 = scr.nextDouble();
        System.out.println("Ingrese un numero:");
        d2 = scr.nextDouble();
        resultado = ejercicios.mayorOmenor(d1, d2);
        System.out.println("" + resultado) ;

        System.out.println("2.3 Determinar de tres numeros el mayor y el menor");
        System.out.println("Ingrese el 1 numero:");
        d1 = scr.nextDouble();
        System.out.println("Ingrese el 2 numero:");
        d2 = scr.nextDouble();
        System.out.println("Ingrese el 3 numero:");
        d3 = scr.nextDouble();
        resultado = ejercicios.menorOmayor1(d1, d2, d3);
        System.out.println("" + resultado);
     
        System.out.println("2.4 Determinar sumar si A es menor que o sino restarlos");
        System.out.println("Ingrese numero A");
        d1 = scr.nextDouble();
        System.out.println("Ingrese numero B");
        d2 = scr.nextDouble();
        resultado = ejercicios.SumarsiAyB(d1, d2);
        System.out.println("La operacion es una "+ resultado);

        System.out.println("2.5 Defenir cociente numero A y B");
        System.out.println("Ingrese numero A");
        d1 = scr.nextDouble();
        System.out.println("Ingrese numero B");
        d2 = scr.nextDouble();
        resultado = ejercicios.cocienteAyB(d1, d2);
        System.out.println(""+ resultado);
        
        break;
        
    }  
}   
}