import java.util.Scanner;
class Modulo{
    public static void main (String[] args){
    Scanner op= new Scanner(System.in);
    int a, b;
    System.out.println ("ingrese un numero");
    a= op.nextInt();
    System.out.println("ingrese otro numero");
    b= op.nextInt();
    System.out.print("el resultado es:  ");
    System.out.println(a%b);

}
}