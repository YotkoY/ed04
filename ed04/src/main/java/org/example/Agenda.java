package org.example;

import java.util.*;

        /*Clase Agenda
        * Esta clase representa una agenda de contactos
        * Permite añadir, eliminar y modificar contactos
        */
public class Agenda {
    private List<Contacto> contacts; // Lista de Contacto

        /*Constructor de la clase Agenda
        * Inicializa la lista de contactos
        */
    public Agenda() {
        this.contacts = new ArrayList<>();
    }

        /*Metodo para añadir un contacto a la lista de contactos
        * Si el contacto ya existe, añade un nuevo telefono
        * @param name  Nombre del contacto a añadir.
        * @param phone Número de teléfono del contacto a añadir.
        */
    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Contacto c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Contacto newContact = new Contacto(name, phone);
            contacts.add(newContact);
        }
    }

        /*Metodo para eliminar un contacto de la lista de contactos
        * @param name nombre del contacto a eliminar
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

        /*Metodo para modificar el numero de telefono de un contacto
         * @param name      Nombre del contacto cuyo número se modificará.
         * @param oldPhone  Número de teléfono antiguo que será reemplazado.
         * @param newPhone  Nuevo número de teléfono que reemplazará al antiguo.
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

        /*Metodo para obtener la lista de contactos
        *  @return Lista de contactos
        */
    public List<Contacto> getContacts() {
        return this.contacts;
    }
}
