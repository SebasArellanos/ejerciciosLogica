import java.util.Scanner;
class RestaRecursiva{
    public static void main (String[] args){
    Scanner op= new Scanner(System.in);
    int c;
    do{
    System.out.println("ESCOGE UNA OPCION");
    System.out.println("1: SUMA");
    System.out.println("0: SALIR");
    c= op.nextInt();
    if(c==1){    
    int a, b;
    System.out.println ("ingrese un numero");
    a= op.nextInt();
    System.out.println("ingrese otro numero");
    b= op.nextInt();
    System.out.print("el resultado es:  ");
    System.out.println(a-b);
    }
}while(c>0);
}
}