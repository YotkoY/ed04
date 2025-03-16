package org.example;

import java.util.ArrayList;
import java.util.List;
/* Clase Contacto
 * Esta clase representa un contacto en la agenda.
 * Cada contacto tiene un nombre y una lista de números de teléfono.
 */
class Contacto {
    private String name;
    private List<String> phones;

    /* Constructor de la clase Contacto
     * @param name Nombre del contacto.
     * @param phone Número de teléfono del contacto.
     */

    public Contacto(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }
    /* Método para añadir un número de teléfono al contacto.
     * @param phone Número de teléfono a añadir.
     */

    public String getName() {
        return this.name;
    }
    /* Método para obtener la lista de números de teléfono del contacto.
     * @return Lista de números de teléfono.
     */

    public List<String> getPhones() {
        return this.phones;
    }
}
