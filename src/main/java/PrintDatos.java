import static java.lang.Long.parseLong;

public class PrintDatos {

    public static void main(String[] args) {
        int dateInt = 10;
        String dateString = "Este es un estring";
        double dateDouble = 10.1153;
        float dateFloat = (float) 10.1;
        char dateChar = 'c';
        boolean dateBoolean = true;

        long dateLong = 45l;

        System.out.println("Este es un Integer: " + dateInt);
        System.out.println(dateString);
        System.out.println("Este es un double: " + dateDouble);
        System.out.println("Este es float: " + dateFloat);
        System.out.println("Este es un Char: "+ dateChar);
        System.out.println("Este es un Boolean: " + dateBoolean);
        System.out.print("Este es un Long: " + dateLong);
    }
}
