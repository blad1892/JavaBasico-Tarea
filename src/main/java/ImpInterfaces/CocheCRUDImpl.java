package ImpInterfaces;

import interfaces.CocheCRUD;

public class CocheCRUDImpl implements CocheCRUD {

    public CocheCRUDImpl() {
    }

    @Override
    public void save() {
        System.out.println("Metodo Save!");
    }

    @Override
    public void findAll() {
        System.out.println("Metodo FindAll!");
    }

    @Override
    public void delete() {
        System.out.println("Metodo Delete!");
    }
}
