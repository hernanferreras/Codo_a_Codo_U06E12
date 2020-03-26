
package u06e12;

import java.util.Scanner;

public class U06E12 {

    public static void main(String args[]) {
        int largo=0, multiplo;
        int[] a = new int[largo];
        largo=ingresarLargo(); 
        multiplo=ingresarMultiplo();
        a=llenarArray(largo, multiplo);
        imprimeArray(a);
    }
    static int ingresarLargo(){
        int j;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el largo del array: ");
        j=entrada.nextInt();
        return(j);
    }
    static int[] llenarArray(int x, int y){
        int e, f=1; 
        int[] array=new int[x];
        for (e=0; e<array.length; e++){
            array[e]=f*y;
            f++;
        }
        return (array);
    }
    static void imprimeArray(int[] a){
        int i;
        for(i=0; i<a.length; i++){
        System.out.println("El valor "+(i+1)+" del array es: "+a[i]);
        }
    }
    static int ingresarMultiplo(){
        int a;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el numero por el cual se va a multiplicar el array: ");
        a=entrada.nextInt();
        return(a);
    }
}