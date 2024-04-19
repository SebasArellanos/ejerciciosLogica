import java.util.Scanner;
class NumerosIguales{
    public static void main(String[] args) {
    Scanner op= new Scanner(System.in);
    int a;
    do{
    System.out.println("ESCOGE UNA OPCION");
    System.out.println("1: NUMERO IGUALES");
    System.out.println("0: SALIR");
    a= op.nextInt();
    int b, c;
    if(a==1){
    System.out.println("DIGITE UN NUMERO");
    b= op.nextInt();
    System.out.println("DIGITE UN NUMERO MAS");  
    c= op.nextInt();  
    if(b==c){
    System.out.println("LOS NUMEROS "+b+" y "+c+" SON IGUALES");
    }else{
        System.out.println("NO SON IGUALES LOS NUMEROS "+b+" y "+c);
    }
    }
}while(a>0);
    }
    }