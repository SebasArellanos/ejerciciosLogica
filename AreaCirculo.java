import java.util.Scanner;
class AreaCirculo{
    public static void main (String[] args){
    Scanner op= new Scanner(System.in);
    int a;
    do{
    System.out.println("ESCOGE UNA OPCION");
    System.out.println("1: AREA DEL CIRCULO");
    System.out.println("0: SALIR");
    a= op.nextInt();
    if(a==1){    
    int b;
    double c= 3.1416;
    System.out.println("ingresa el radio del circulo");
    b= op.nextInt();
    System.out.print("el area del circulo es:  ");
    System.out.println(c*b*b);
    }
}while(a>0);
}
}