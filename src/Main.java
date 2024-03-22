import java.util.Scanner; ///Aquí estamos importando la clase Scanner del paquete java.util, que nos permitirá leer la entrada del usuario.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        char continuar = 's';

        System.out.println("MENU");
        while (continuar == 's') {

            System.out.printf("Seleccione una opcion (1-8):");
            opcion = scanner.nextInt();

            switch(opcion) {

                case 1:
                 punto1();
                break;

                case 2:
                punto2();
                break;

                case 3:
                punto3();
                break;

                case 4:
                punto4();
                break;

                case 5:
                punto5();
                break;

                case 6:
                punto6();
                break;

                case 7:
                    int numero = 5;
                    int factorial = punto7(numero);
                    System.out.printf("El factorial de %d es: %d\n", numero, factorial);
                    break;

                case 8:
                    System.out.print("Ingrese el valor de n para calcular el n-ésimo término de la serie de Fibonacci: ");
                    int nFibonacci = scanner.nextInt();
                    int fibonacciResult = fibonacci(nFibonacci);
                    System.out.println("El " + nFibonacci + "-ésimo término de la serie de Fibonacci es: " + fibonacciResult);
                    break;



                default:
                    System.out.printf("La opcion que ingreso es incorrecta...");


            }

            System.out.printf("Desea ingresar otra opcion? (S/N)");
            continuar = scanner.next().charAt(0); //Ponemos 0 para tomar el primer caracter que seleccione el usuario

        }

        scanner.close();

    }

    //PUNTO 1.Imprimir:
    //PUNTO A.   Un mensaje en consola
    //PUNTO B.   Declarar e imprimir una variable de tipo entero

    public static void punto1(){


        int variableEntero = 10;

        System.out.println("La variable de tipo entero es: " + variableEntero);


        ///PUNTO C.   Declarar e imprimir una variable de tipo flotante

        float  variableFlotante = 20;

        System.out.println("La variable de tipo flotante es: " + variableFlotante);


    }


    //PUNTO 2.Pedir al usuario que ingrese un número y luego imprimirlo
    public static void punto2(){

        //----Int-----//

        //creo un objeto scanner y lo llamo scanner (el nombre puede variar), esto para poder guardar el dato que ingresemos a la variable
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero entero: "); //Le pedimos al usuario ingresar un numero

        int numero = scanner.nextInt(); //Utilizamos el método nextInt() de la clase Scanner para leer un número entero desde la entrada estándar y lo almacenamos en la variable numero.

        System.out.println("El numero ingresado es " + numero); //Imprimimos el numero ingresado


        //-----Float-----//

        System.out.println("Ingrese un numero con coma: "); //Le pedimos al usuario un numero de tipo float

        float numero2 = scanner.nextFloat(); //

        System.out.println("El numero ingresado es " + numero2);

        // Cerrar el Scanner para evitar posibles problemas de recursos
        scanner.close();


    }


    //PUNTO 3.Realizar una suma de dos números ingresados por el usuario e imprimir el resultado
    public static void punto3(){

        Scanner scanf = new Scanner(System.in);

        System.out.println("Ingrese dos numeros");

        System.out.println("Numero 1: ");
        float numero = scanf.nextFloat();
        System.out.println("Numero 2: ");
        float numero2 = scanf.nextFloat();

        float suma = numero + numero2;

        System.out.println("La suma de los numeros es: " + suma);




    }



//PUNTO 4.Realizar un bucle que imprima los números del 1 al 10
    public static void punto4(){


        for(int i=1; i<10; i++){

            System.out.println("Nº " + i);

    }


}


//PUNTO 5.Realizar una función que calcule el área de un rectángulo y la imprima (base * altura)
public static void punto5(){
        Scanner scanner= new Scanner(System.in);

        int area;
        int base;
        int altura;

    System.out.println("Vamos a calcular el area de un rectángulo ");

    System.out.println("Ingrese la Base: ");
    base = scanner.nextInt();

    System.out.println("Ingrese la Altura: ");
    altura= scanner.nextInt();

    area= base * altura;

    System.out.printf("El area del rectangulo es: " + area);
    System.out.printf("cm");

}

//PUNTO 6.Realizar una función que determine si un número es par o impar
public static void punto6(){

        Scanner scanner= new Scanner(System.in);

        int numero;

    System.out.printf("Ingrese un numero (+ ò -): ");
    numero = scanner.nextInt();

    if(numero%2==0){

        System.out.println("Su numero es Par");


    }else{

        System.out.printf("Su numero es Impar");

    }

}

//PUNTO 7.Realizar una función que calcule el factorial de un número
public static int punto7(int numero){

    if (numero==0){

        return 1;


    }else {

        return numero * punto7(numero - 1);

    }

}


//8.   Función para calcular el n-ésimo término de la serie de Fibonacci. Explicación: Comienza con 0 y 1,
// y los términos subsiguientes se calculan sumando los dos términos anteriores.
// La secuencia comienza así: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, y así sucesivamente

    // Función para calcular el n-ésimo término de la serie de Fibonacci
    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }


}