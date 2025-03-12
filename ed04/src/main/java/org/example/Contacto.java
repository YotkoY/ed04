package org.example;

import java.util.ArrayList;
import java.util.List;

    /*Clase Contacto
    *Esta clase representa un contacto en la agenda
    *Cada contacto tiene un nombre y una lista de telefonos
    */
class Contacto {
    private String name;
    private List<String> phones;

    /*Constructor de la clase Contacto
    * Inicializa el nombre del contacto y añade un telefono a la lista
    * @param name  Nombre del contacto
    * @param phone Número de teléfono del contacto
    */
    public Contacto(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    /*Metodo para obtener el nombre del contacto
    * @return Nombre del contacto
    */
    public String getName() {
        return this.name;
    }

    /*Metodo para obtener la lista de telefonos del contacto
    * @return Lista de telefonos del contacto
    */
    public List<String> getPhones() {
        return this.phones;
    }
}
