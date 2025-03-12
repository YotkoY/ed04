package org.example;

import java.util.ArrayList;
import java.util.List;
/* Class Contacto
 * Esta clase representa un contacto en la agenda.
 * Cada contacto tiene un nombre y una lista de números de teléfono.
 */
class Contacto {
    private String name;
    private List<String> phones;

    public Contacto(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    public String getName() {
        return this.name;
    }

    public List<String> getPhones() {
        return this.phones;
    }
}