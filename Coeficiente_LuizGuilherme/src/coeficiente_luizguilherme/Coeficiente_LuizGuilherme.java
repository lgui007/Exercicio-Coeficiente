
package coeficiente_luizguilherme;
import java.util.Scanner;

public class Coeficiente_LuizGuilherme 
{

    
    public static void main(String[] args) 
    {
     Scanner entrada = new Scanner(System.in);
    double a,b,c,delta,x1,x2;
    
    System.out.println("Digite o valor de a: ");
    a = entrada.nextDouble();
    System.out.println("Digite o valor de b: ");
    b = entrada.nextDouble();
    System.out.println("Digite o valor de c: ");
    c= entrada.nextDouble();
    
    if(a!=0);
    delta = Math.pow(b,2) - (4*a*c);
    
    if(delta>=0) 
    {
    x1 = ((-b) + Math.sqrt(delta))/(2*a);
    x2 = ((-b) - Math.sqrt(delta))/(2*a);
    System.out.println("As raizes são x1: "+x1+" e x2:"+x2);
    }
    
    else if (delta == 0)
    {
    x1 = ((-b) + Math.sqrt(delta))/(2*a);
    System.out.println("As raizes são:"+x1);
    }
    else if (delta<0)
    System.out.println("A equação não possui resultados reais:"); 
        
    }
    
}
