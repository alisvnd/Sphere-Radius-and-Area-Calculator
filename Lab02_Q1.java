
import java.util.Scanner ; 

public class Lab02_Q1 {
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in) ;

        System.out.print("Enter volume of sphere: ");

        double Volume = in.nextDouble() ;

        double r = Math.cbrt((3*Volume)/(4*Math.PI)) ;

        double A = 4*Math.PI*Math.pow(r,2);

        System.out.printf("The radius of the sphere is: %21.1f" , r);

        System.out.println("");

        System.out.printf("The surface area of the sphere is: %15.1f" , A);



    

        
        
    }
    
}
