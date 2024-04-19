import java.util.Scanner;
class NumerosDecedentes{
    public static void main(String[] args) {
    Scanner op= new Scanner(System.in);
    int a;
    do{
    System.out.println("ESCOGE UNA OPCION");
    System.out.println("1: NUMERO Decedentes");
    System.out.println("0: SALIR");
    a= op.nextInt();
    int b, c, d;

    if(a==1){
    System.out.println("DIGITE UN NUMERO");
    b= op.nextInt();
    System.out.println("DIGITE UN NUMERO");  
    c= op.nextInt();  
    System.out.println("DIGITE UN NUMERO");  
    d= op.nextInt();  
    if(b>c && c>d){
    System.out.println(b+" "+c+" "+d);
    }else if(b>d && d>c){
    System.out.println(b+" "+d+" "+c);
    }else if(c>b && b>d){
    System.out.println(c+" "+b+" "+d);
    }else if(c>d && d>b){
    System.out.println(c+" "+d+" "+b);
    }else if(d>b && b>c){
    System.out.println(d+" "+b+" "+c);
    }else if(d>c && c>b){
    System.out.println(d+" "+c+" "+b);
    }else{
    System.out.println("SON IGUALES");
    }

    }
}while(a>0);
    }
    }