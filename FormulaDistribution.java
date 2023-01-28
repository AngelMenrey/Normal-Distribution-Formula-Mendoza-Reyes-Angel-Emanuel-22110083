import java.util.Scanner;

public class FormulaDistribution {
    public static void main (String [] args ) throws Exception{
    Scanner formula = new Scanner (System.in);
    double Z, x, media, desviacion;
    System.out.println("NORMAL DISTRIBUTION FORMULA");
    System.out.println("ENTER THE VALUE OF X");
    x = formula.nextDouble();
    System.out.println("ENTER THE VALUE OF THE MEAN");
    media = formula.nextDouble();
    System.out.println("ENTER THE VALUE OF THE STANDARD DEVIATION");
    desviacion = formula.nextDouble();
    Z = ( x - media)/desviacion;
    System.out.println(" THE VALUE OF Z IS: "+ Z);
    }
    }
    
    
