import java.util.Scanner;
class AreaTriangulo{
    public static void main (String[] args){
    Scanner op= new Scanner(System.in);
    int a;
    do{
    System.out.println("ESCOGE UNA OPCION");
    System.out.println("1: AREA DEL TRIANGULO");
    System.out.println("0: SALIR");
    a= op.nextInt();
    if(a==1){    
    int b, c;
    System.out.println("ingresa el valor de la base del triangulo");
    b= op.nextInt();
    System.out.println("ingresa la altura del trinagulo");
    c= op.nextInt();
    System.out.print("el area del triangulo es:  ");
    System.out.println(b*c /2);
    }
}while(a>0);
}
}