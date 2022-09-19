import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Ejercicio_tema_7_8_9 {

    public static void main(String[] args) {

        System.out.printf("Punto 1: \n" + reverse("hola mundo"));

        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto"};
        System.out.println("Punto 2: \n");
        arrayunidimensional(meses);

        System.out.println("Punto 3: \n");
        int[][] enteros = {{10, 20, 30}, {15, 30, 60}};
        arraybidimensional(enteros);

        vector4();

        arrayList_linkedList();

        arrayInt();

        System.out.println("-------Punto 7:------\nDivide x Cero: " + dividePorCero(0));
        //Punto 8
        buscarFichero("C:/Users/yosle/IdeaProjects/Tema1/src/main/java/achivo1.txt", "achivo2.txt");
    }

    //1. Devolver un cadena de TEXTO al reves
    public static String reverse(String texto) {
        String textReverso = "";
        for (int i = texto.length(); i >= 1; i--) {
            textReverso += texto.substring(i - 1, i);
        }
        return textReverso;
    }

    //2. Array unidimensional
    public static String arrayunidimensional(String[] cadena) {
        for (String meses : cadena)
            System.out.println(meses);
        return "";
    }


    //3. Array bidimensional
    public static void arraybidimensional(int[][] dato) {
        for (int i = 0; i <= 1; i++) {
            System.out.println("posicion " + i + ": \t");
            for (int j = 0; j <= 2; j++) {
                System.out.printf(dato[i][j] + ",");
            }
            System.out.println("");
        }
    }

    //4. Vector
    public static void vector4() {
        System.out.printf("------Punto 4: ------\n");
        Vector<String> nombre = new Vector<String>();
        nombre.add("Bladimir");
        nombre.add("Maria");
        nombre.add("Jefri");
        nombre.add("Manuel");
        nombre.add("Francisco");

        nombre.remove(1);
        nombre.remove(1);

        System.out.println(nombre.toString());
    }

    //5. Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList.
    // Recorre ambos mostrando únicamente el valor de cada elemento.
    public static void arrayList_linkedList() {
        System.out.println("------Punto 5: -------");
        ArrayList<String> cuatrimestreArr = new ArrayList<>(3);
        cuatrimestreArr.add("enero");
        cuatrimestreArr.add("febrero");
        cuatrimestreArr.add("marzo");
        cuatrimestreArr.add("abril");
        LinkedList<String> cuatrimestreLinck = new LinkedList<>(cuatrimestreArr);

        //Mostrar ArrayList
        System.out.println("Esto son los elemtos del ArrayList: \n" + cuatrimestreArr.toString());
        System.out.println("Esto son los elemtos del LinckList: \n" + cuatrimestreLinck.toString());
    }

    //6. Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación,
    // con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el
    //ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for"
    //  de relleno.
    public static void arrayInt() {
        System.out.println("-----Punto 6: ------\n");
        ArrayList<Integer> elemntos = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            elemntos.add(i);
        }
        for (int i = 0; i <= 10; i++) {
            if ((elemntos.indexOf(i) % 2) == 0)
                elemntos.set(i, 0);
        }
        System.out.println("Numeros impares: ");
        for (int v : elemntos) {
            System.out.println(v);
        }
    }

    /*
    7. Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo
    ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la
    excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código"
    */
    public static float dividePorCero(float valor) throws ArithmeticException {
        float rsul = 0;

        try {
            rsul = valor / 1;
        } catch (ArithmeticException e) {
            System.out.println(e + "Estos no es psoble!");
        }
        System.out.println("Demo!");
        return rsul;
    }

    /*
    8. Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
    La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado
    en "fileOut".
    */
    public static void buscarFichero(String fileIn, String fileOut) {
        InputStream file1;
        PrintStream printStream;
        try {
            file1 = new FileInputStream(fileIn);
            byte[] datos = file1.readAllBytes();

            printStream = new PrintStream(fileOut);
            printStream.write(datos);

        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }

    }
}