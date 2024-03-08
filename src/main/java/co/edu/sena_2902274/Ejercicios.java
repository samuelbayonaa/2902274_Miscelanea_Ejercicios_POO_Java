package co.edu.sena_2902274;
 
//operadores

public class Ejercicios {

    public double areaTriangulo(double d1, double d2){

        return (d1 * d2) / 2;

    }

    public double sumaNumeros(double d1, double d2){

        return ( d1 + d2);
        
    }

    public double numeroCuadrado(double d1){

        return ( d1*d1);
        
    }

    public double conversionE(double d1){

        return ( d1*1.085 );
        
    } 

    public double valorA(double d1){

        return ( d1*d1 );
        
    }  

    public double valorP(double d1){

        return ( d1+d1+d1+d1 );
        
    }  

    public double areaC(double d1, double d2){

        return ( 2 * 3.1416 * (d1 + d1));
        
    }

    public double volumenC(double d1, double d2){

        return ( 3.1416 *  (d1 * d1) * d2);
        
    }

    public double longitudCirculo(double d1){

        return ( 2 * 3.1416 * d1 );

    }

    public double areaCirculo(double d1){

        return ( 3.1416 * Math.pow(d1, 2));
    }
    
    public double promedioN(double d1, double d2, double d3){

        return ( (d1+d2+d3) / 3);
    }

    public String positivoNegativo(double d1){
        
        if (d1>= 0) { 
            return("Positivo");
                
            } else{
            return("Negativo");
            }
        }
    
    public String mayorOmenor (double d1, double d2){

        if (d1 > d2){
            return(d1 + " Es mayor que " + d2);
        }else{
            return(d2 + " Es mayor que " + d1);
        }
    }

    public String menorOmayor1(double d1, double d2, double d3){
        if(d1 > d2 && d1 > d3){
            if(d2 > d3){
                  return (d1 + " Es el numero mayor y " + d3 + " Es el numero menor");
            }
            else{
                  return(d1 + " Es el numero mayor y " + d2 + " Es el numero menor");
            }
        }else if(d2 > d1 && d2 > d3){
            if(d3 > d1){   
                  return(d2 + " Es el numero mayor y " + d1 + " Es el numero menor");
            }
            else{
                  return(d2 + " Es el numero mayor y " + d3 + " Es  el numero menor");
            }
      
        }else{
            if(d2 > d1){   
                  return( d3 + " Es el numero mayor y " + d1 + " Es el numero menor");
            }
            else{
                  return( d3 + " Es el numero mayor y " + d2 + " Es el numero menor");
            }
        }

    }
    
    public String SumarsiAyB (double d1, double d2){

        if (d1 < d2) {

            return "suma: " + ( d1+d2 );

        }else if(d1 > d2){

            return "resta: " + ( d1-d2 );

        }else{

            return("Los dos valores son iguales");

        }
    }

    public String cocienteAyB (double d1, double d2){

        if(d2 != 0){

            return "El cociente es: " +(d1 / d2); 
        }else{

            return ("La division no es posible.");
        }

    }

    public String sumaOmultiAyB (double d1, double d2){

        if(d1 < 0 || d2 < 0){

            return "Es una suma: " + ( d1 - d2 );

        }else{

            return "Es una multiplicacion: " + (d1 * d2); 
        }
    }

    public String añobisSiyNO (double d1){

        if ((d1 % 4 == 0) && (d1 % 100 != 0) || (d1 % 400 == 0)) {

            return  d1 + " Es un año bisiesto.";
            
        }else{

            return d1 + " No es un año bisiesto.";

        }

    }


}

