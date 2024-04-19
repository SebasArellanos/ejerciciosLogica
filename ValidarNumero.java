import java.util.Scanner;
class ValidarNumero{
public static void main(String[] args) {
    Scanner op= new Scanner(System.in);
    int a;
    do{
    System.out.println("ESCOGE UNA OPCION");
    System.out.println("1: NUMERO PAR O IMPAR");
    System.out.println("0: SALIR");
    a= op.nextInt();
    int b;
    if(a==1){
    System.out.println("DIGITE UN NUMERO");
    b= op.nextInt();
    if (b%2==0) {
        System.out.println("SI ES PAR");
    } else {
        System.out.println("ES IMPAR");
    }
}
}while(a>0);
}
}