package org.example;

import java.util.*;

/* Clase Agenda
 * Esta clase representa una agenda de contactos.
 * Permite añadir, eliminar y modificar contactos.
 */

public class Agenda {
    private List<Contacto> contacts; // Lista de Contacto
    /* Constructor de la clase Agenda
     * Inicializa la lista de contactos.
     */

    public Agenda() {
        this.contacts = new ArrayList<>();
    }

    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Contacto c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }
        // Si el contacto no existe, se crea uno nuevo.

        if (!exists) {
            Contacto newContact = new Contacto(name, phone);
            contacts.add(newContact);
        }
    }
/* Método para añadir un número de teléfono a un contacto existente.
     * Si el contacto no existe, se crea uno nuevo.
     * @param name Nombre del contacto.
     * @param phone Número de teléfono a añadir.
     */
    public void removeContact(String name) {
        Iterator<Contacto> it = contacts.iterator();

        while (it.hasNext()) {
            Contacto c = it.next();

            if (c.getName().equalsIgnoreCase(name)) {
                it.remove();
            }
        }
    }
    /* Método para eliminar un contacto de la agenda.
     * @param name Nombre del contacto a eliminar.
     */

    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Contacto c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                List<String> phones = c.getPhones();

                int index = phones.indexOf(oldPhone);

                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }
    /* Método para modificar el número de teléfono de un contacto existente.
     * @param name Nombre del contacto.
     * @param oldPhone Número de teléfono antiguo.
     * @param newPhone Número de teléfono nuevo.
     */

    public List<Contacto> getContacts() {
        return this.contacts;
    }
}