import java.util.Scanner;
class AreaCuadrado{
    public static void main (String[] args){
    Scanner op= new Scanner(System.in);
    int a;
    do{
    System.out.println("ESCOGE UNA OPCION");
    System.out.println("1: AREA DEL CUADRADO");
    System.out.println("0: SALIR");
    a= op.nextInt();
    if(a==1){    
    int b;
    System.out.println("ingresa el valor de un lado del cuadrado");
    b= op.nextInt();
    System.out.print("el area del cuadrado es:  ");
    System.out.println(b*b);
    }
}while(a>0);
}
}