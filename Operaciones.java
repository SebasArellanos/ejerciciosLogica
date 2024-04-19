import java.util.Scanner;
class Operaciones{
    public static void main (String[] args){
    Scanner op= new Scanner(System.in);
    int c;
    do{
    System.out.println("ESCOGE UNA OPCION");
    System.out.println("1: SUMA");
    System.out.println("2: RESTA");
    System.out.println("3: MULTIPLICACION");
    System.out.println("4: DIVISION");
    System.out.println("5: MODULO");
    System.out.println("0: SALIR");
    c= op.nextInt();
    int a, b;
    switch (c) {
    case 1:
    System.out.println("SUMA");
    System.out.println ("ingrese un numero");
    a= op.nextInt();
    System.out.println("ingrese otro numero");
    b= op.nextInt();
    System.out.print("el resultado es:  ");
    System.out.println(a+b);
    break;
    case 2:
    System.out.println("RESTA");
    System.out.println ("ingrese un numero");
    a= op.nextInt();
    System.out.println("ingrese otro numero");
    b= op.nextInt();
    System.out.print("el resultado es:  ");
    System.out.println(a-b);
    break;
    case 3:
    System.out.println("MULTIPLICACION");
    System.out.println ("ingrese un numero");
    a= op.nextInt();
    System.out.println("ingrese otro numero");
    b= op.nextInt();
    System.out.print("el resultado es:  ");
    System.out.println(a*b);
    break;
    case 4:
    System.out.println("DIVISION");
    System.out.println ("ingrese un numero");
    a= op.nextInt();
    System.out.println("ingrese otro numero");
    b= op.nextInt();
    System.out.print("el resultado es:  ");
    System.out.println(a/b);
    break;
    case 5:
    System.out.println("MODULO");
    System.out.println ("ingrese un numero");
    a= op.nextInt();
    System.out.println("ingrese otro numero");
    b= op.nextInt();
    System.out.print("el resultado es:  ");
    System.out.println(a%b);
    break;
    default:
    break;
}
}while(c>0);
}
}