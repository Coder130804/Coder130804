import java.util.Scanner;
class Root 
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter coefficients a,b,c:");
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        System.out.println("Equation: "+a+"x^2+"+b+"x+"+c+"=0");
        double d=(b*b)-(4*a*c);
        if (d>= 0) {
            double r1=(-b+Math.sqrt(d))/(2*a);
            double r2=(-b-Math.sqrt(d))/(2*a);
            System.out.println("Roots are real and distinct.");
            System.out.println("Root 1 = "+r1);
            System.out.println("Root 2 = "+r2);
        } else {
            System.out.println("Roots are imaginary.");
            double rP=-b/(2.0*a);
            double iP=Math.sqrt(-d)/(2 * a);
            System.out.println("Root 1 = "+rP+" + "+iP+"i");
            System.out.println("Root 2 = "+rP+" - "+iP+"i");
        }
    }
}
