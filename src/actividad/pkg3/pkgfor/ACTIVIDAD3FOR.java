package actividad.pkg3.pkgfor;
import java.util.Scanner;
public class ACTIVIDAD3FOR {
     public static void main(String[] args) {
        System.out.println("Selecciona el que sea de su interes ");
        System.out.println("1.-SUMA DEL 1 AL 10 ");
        System.out.println("2.- FACTORIAL DEL NUMERO 10");
        System.out.println("3.- FACTORIAL INGRESADO POR USTED");
        System.out.println("4.- MEDIA DEL NUMERO INGRESADO");
        System.out.println("5.- TODO LO ANTERIOR ");
        System.out.println("6.- LOS DIAS DE LA SEMANA");
        System.out.println("7.- ESTRUCTURA DEL JUEGO DEL GATO");
        System.out.println("Ingresa tu numero: ");
        Scanner entrada= new Scanner(System.in);
        int general=entrada.nextInt();
        
        switch (general){
            case 1:
                System.out.println("-------------------------");
                System.out.println("1.-SUMA DEL 1 AL 10 ");
                System.out.println("-------------------------");
                _for1();
                break;
            case 2:
                System.out.println("-----------------------------");
                System.out.println("2.- FACTORIAL DEL NUMERO 10");
                System.out.println("-----------------------------");
                _for2();
                break;
            case 3:
                System.out.println("------------------------------------");
                System.out.println("3.- FACTORIAL INGRESADO POR USTED");
                System.out.println("------------------------------------");
                _for3();
                break;
            case 4:
                System.out.println("----------------------------------");
                System.out.println("4.- MEDIA DEL NUMERO INGRESADO");
                System.out.println("----------------------------------");
                _for4();
                break;
            case 5: 
                System.out.println("--------------------------");
                System.out.println("5.- TODO LO ANTERIOR ");
                System.out.println("--------------------------");
                _for5();
                break;
            case 6:
                System.out.println("---------------------------");
                System.out.println("6.- LOS DIAS DE LA SEMANA");
                System.out.println("----------------------------");
                _for6();
                break;
            case 7:
                System.out.println("------------------------------------");
                System.out.println("7.- ESTRUCTURA DEL JUEGO DEL GATO");
                System.out.println("------------------------------------");
                _for7();
                break;
            default:
                 System.out.println("ERROR");
                 
        }
     }
     
    public static void _for1(){
    //1.- Imprimir la suma consecutiva del 0 al 10
        int sumador=0;
        for(int i=0; i<=10;i++){
           sumador+=i;
        }
        System.out.println("La suma del 0 al 10 = "+sumador); 
    }
    public static void _for2(){
    //2.- Calcular el factorial del 1 al 10
        int factorial=1;
        for(int i=1; i<=10;i++){
           factorial*=i;
        }
        System.out.println("El factorial del 1 al 10 es = "+factorial);
    }
    public static void _for3(){
    //3.- Calcular el factorial de un número que sea introducido por el usuario
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingresa tu numero: ");
        int n=entrada.nextInt();
        int factorial=1;
        for(int i=1; i<=n;i++){
            factorial*=i;
        }
        System.out.println("El factorial de tu numero es: "+ factorial);
    }
    public static void _for4(){
    //4.- Calcular la media de la suma del 0 hasta el número introducido por el usuario
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingresa tu numero: ");
        int n=entrada.nextInt();
        int sumador=0;
        for(int i=0; i<=n;i++){
        sumador+=i;    
        }
        double media= (double) sumador/ (n);
        System.out.println("La media es de " + media);  
    }
    public static void _for5(){
    /*5.- Pedir un número y leer n veces números, realizar la suma de los números, 
    sacar el promedio y determinar cuál número introducido es el mayor y cuál el menor,
    y la distancia numérica entre ellos.
    */
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingresa tu numero: ");
        int n=entrada.nextInt();
        int sumador=0;
        int diferencia= n-1;
        for(int i=1; i<=n;i++){
        System.out.println(i);
        sumador+=i;    
        }
        double media= (double) sumador/ (n);
        System.out.println("La suma es de " + sumador); 
        System.out.println("La media es de " + media); 
        System.out.println("El numero mayor es de " + n);
        System.out.println("La numero menor  es de " + 1);
        System.out.println("La diferencia entre ellos dos es de "+ diferencia);    
    }
    public static void _for6(){
    //6.- Imprima un arreglo que tenga los nombres de los días de la semana.
        String[] dia={"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        for(int i=0; i<=6;i++){
            System.out.println(dia[i]);
        }
        
    }
     public static void _for7(){
     //7.- Crea un modelo del juego del gato
     String juego[][] = new String[3][3];
        
        for(String horizontal[]: juego){
            for(String vertical: horizontal){
                System.out.print("__" + "  ");
            }
            System.out.println(" ");
        }
        
    }
         
         
    }
   