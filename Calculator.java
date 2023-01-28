import java.util.Scanner;

public class Calculator {
    public static void main (String [] args ) throws Exception{
        Scanner leer = new Scanner (System.in);
        double numUno, numDos, res;
        int opc;
        
        System.out.println("BIEVENIDO A LA CALCULADORA BASICA");
        System.out.println("OPCIONES:");
        System.out.println("1. SUMAR");
        System.out.println("2. RESTAR");
        System.out.println("3. MULTIPLICAR");
        System.out.println("4. DIVIDIR");
        opc = leer.nextInt();
 switch(opc){

case 1:
 System.out.println("INGRESE EL PRIMER NUMERO");
  numUno = leer.nextDouble();
System.out.println("INGRESE EL SEGUNDO NUMERO");
numDos = leer.nextDouble();
res = numUno + numDos;
System.out.println("EL RESULTADO DE LA SUMA ES: " + res);
break;

case 2:
System.out.println("INGRESE EL PRIMER NUMERO");
numUno = leer.nextDouble();
System.out.println("INGRESE EL SEGUNDO NUMERO");
numDos = leer.nextDouble();
res = numUno - numDos;
System.out.println("EL RESULTADO DE LA RESTA ES: " + res);
break;
 
case 3:
System.out.println("INGRESE EL PRIMER NUMERO");
numUno = leer.nextDouble();
System.out.println("INGRESE EL SEGUNDO NUMERO");
numDos = leer.nextDouble();
res = numUno * numDos;
System.out.println("EL RESULTADO DE LA MULTIPLICACION ES: "+ res);
break;

case 4:
System.out.println("INGRESE EL PRIMER NUMERO");
numUno = leer.nextDouble();
System.out.println("INGRESE EL SEGUNDO NUMERO");
numDos = leer.nextDouble();
res = numUno / numDos;
System.out.println("EL RESULTADO DE LA DIVISION ES: " + res);
break;

default:
System.out.println("OPCION INVALIDA");
 }
    }
}



