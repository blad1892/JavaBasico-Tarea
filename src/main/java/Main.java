import ImpInterfaces.CocheCRUDImpl;

public class Main {

    static CocheCRUDImpl cocheCRUD = new CocheCRUDImpl();

    public static void main(String[] args) {
        //Entrega ejercicios tema 5
        cocheCRUD.save();
        cocheCRUD.findAll();
        cocheCRUD.delete();

    }


}
