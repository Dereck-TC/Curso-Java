import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ArithmeticException{
        //reverse("hola mundo");
        //recorre();
        //recorreBidi();
        //vector();
        //arrayList();
        //numberList();
        dividePorCero();
    }
    public static String reverse(String texto) {
        for (int i = texto.length()-1; i >= 0; i--){
            System.out.println(texto.charAt(i));
        }
        return texto;
    }
    public static void recorre(){
        String array[] = {"primero","segundo","tercero"};
        for(String recorrer : array) {
            System.out.println("El valor: " + recorrer);
        }
    }
    public static void recorreBidi(){
        String arraybi[][] = {
                {"1","2","3","4"},
                {"Lucas","Ana","Nicole","Alex"}
        };
        for(int i = 0; i < arraybi.length; i++){
            System.out.println("valor de i es: " + i);
            for(int j = 0; j < arraybi[i].length;j++){
                System.out.println("Estoy en fila: " + i + " con valor " + arraybi[i][j]);
            }
        }
    }
    public static void vector(){
        Vector<String> mivector = new Vector();
        mivector.add("elemento1");
        mivector.add("elemento2");
        mivector.add("elemento3");
        mivector.add("elemento4");
        mivector.add("elemento5");
        mivector.remove(1);
        mivector.remove(1);
        System.out.println(mivector);
    }
    public static void arrayList(){
        ArrayList<String> miLista = new ArrayList<String>();
        miLista.add("elemento 1");
        miLista.add("elemento 2");
        miLista.add("elemento 3");
        miLista.add("elemento 4");
        LinkedList<String> milinkedlista = new LinkedList<>(miLista);
        for(String lista : miLista) {
            System.out.println("Mi lista tiene el " + lista);
        }
        for (String linkedlista : milinkedlista){
            System.out.println("Mi linkedlista tiene el " + linkedlista);
        }
    }
    public static void numberList(){
        ArrayList<Integer> lista = new ArrayList<>();
        for ( int i = 1; i <= 10; i++){
            lista.add(i);
        }
        /*for(int removePares : lista){
            if(removePares % 2 == 0) {
                lista.remove(removePares - 1);
                continue;
            }
        }*/
        for(int i = 1; i < lista.size(); i++){
            //int i1 = i % 2 == 0 ? lista.remove(i) : i;
            if(lista.get(i)%2==0){
                lista.remove(i);
                System.out.println(i);
            }
        }
        //lista.remove(2-1);
        System.out.println(lista);
        //lista.remove(2-1);
        //System.out.println(lista);
    }
    public static void dividePorCero(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int a = Integer.parseInt(scanner.next());
        System.out.print("Ingresa otro número: ");
        int b = Integer.parseInt(scanner.next());
        try{
            int result = a / b;
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println("Hubo un error " + e.getMessage());
        }finally {
            System.out.println("Demo de código");
        }

    }
    public static class DividePorCero {

        private static int Dividir(int a, int b) throws ArithmeticException {
            return a / b;
        }

        public static void main(String[] args) {

            System.out.println("-------------------- \n DividePorCero\n--------------------");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Indica los numeros que quieres dividir: ");
            System.out.print("Numero 1: ");
            int a = scanner.nextInt();
            System.out.print("Numero 2: ");
            int b = scanner.nextInt();
            try {
                System.out.println("Resultado: " + Dividir(a, b));
            } catch (ArithmeticException e) {
                System.out.println("Esto no puede hacerse");
            } finally {
                System.out.println("Demo de código");
            }
        }
    }

    public static class File{
        public static void main(String[] args){
            Rfile("C:\\Java\\hola.txt","C:\\copia\\hola.txt");
        }
        public static void Rfile(String fileIn, String fileOut){
            try {
                InputStream source = new FileInputStream(fileIn);
                byte[] datos = source.readAllBytes();
                source.close();

                PrintStream destiny = new PrintStream(fileOut);
                destiny.write(datos);
                destiny.close();

            } catch (Exception e) {
                System.out.println("Exception " + e);
                System.out.println(fileIn);
            }

        }
    }
    public static class CopiarFicheros {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduce el fichero de origen: ");
            String fileIn = scanner.nextLine();
            System.out.println("Introduce el fichero de destino: ");
            String fileOut = scanner.nextLine();
            copiar(fileIn, fileOut);
        }

        private static void copiar(String fileIn, String fileOut) {
            try {
                InputStream in = new FileInputStream(fileIn);
                byte[] datos = in.readAllBytes();
                in.close();

                PrintStream out = new PrintStream(fileOut);
                out.write(datos);
                out.close();
            } catch (Exception e) {
                System.out.println("Excepcion: " + e.getMessage());
            }
        }

    }

}
