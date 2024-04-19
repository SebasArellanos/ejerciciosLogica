import java.util.Scanner;
class NumerosEnBucleDesc{
    public static void main(String[] args) {
    Scanner op= new Scanner(System.in);
    int a;
    do{
    System.out.println("ESCOGE UNA OPCION");
    System.out.println("1: NUMEROS EN BUCLE");
    System.out.println("0: SALIR");
    a= op.nextInt();
    if(a==1){
    int j;   
    System.out.println("DIGITE UN NUMERO");
    j= op.nextInt(); 
    for(int i=0; j>=i; j--){
    System.out.println(j);
    }    

    }
}while (a>0);   
}
}