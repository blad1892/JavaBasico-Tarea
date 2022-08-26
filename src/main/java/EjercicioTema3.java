public class EjercicioTema3 {
    public static void main(String[] args) {
        String[] nombre = {"Bladimir", "Jose", "Maria", "Fausto"};
        String[] apellidos = {"Rojas", "Morla", "Martinez", "Rojas"};

        for (int i = 0; i <= 3; i++) {
            nombre[i] += " " + apellidos[i];
            System.out.println(nombre[i]);
        }
    }
}
