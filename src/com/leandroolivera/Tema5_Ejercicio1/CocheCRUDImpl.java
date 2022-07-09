package com.leandroolivera.Tema5_Ejercicio1;
/**
 * @author Leandro Olivera
 * Java Básico - Open Bootcamp
 * Tema 5 - Ejercicio 1
 *
 * Crear una interfaz CocheCRUD.
 *
 * Crear una implementación CocheCRUDImpl que implemente la interfaz CocheCRUD.
 *
 * Como métodos de CocheCRUD podemos poner:
 *
 * save() findAll() delete() que simplemente impriman por consola el nombre del propio método.
 *
 * Desde una clase Main, Crear un objeto de tipo CocheCRUDImpl y llamar a cada uno de los métodos.
 *
 * Ejemplo:
 *
 * CocheCRUD cocheCrud = new CocheCRUDImpl()
 */

public class CocheCRUDImpl implements CocheCRUD{
    @Override
    public void save() {
        System.out.println("Iniciaste la llamada al método save");
    }

    @Override
    public void findAll() {
        System.out.println("Iniciaste la llamada al método findAll");
    }

    @Override
    public void delete() {
        System.out.println("Iniciaste la llamada al método delete");
    }
}
