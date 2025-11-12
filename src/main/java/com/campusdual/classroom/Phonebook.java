package com.campusdual.classroom;

import com.campusdual.Utils;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class Phonebook {
    private Map<String, Contact> listacontactos;

    public Phonebook(){
        this.listacontactos = new HashMap<>();
    }

    public void addContact (Contact contact){
        listacontactos.put(contact.getCode(), contact);
    }

    public void deleteContact (String code){
        listacontactos.remove(code);
    }


    private Map<String, Contact> listacontactos() {
        return listacontactos;
    }

    public Map<String, Contact> getData(){
        return listacontactos;
    }


    public void showPhonebook() {
        if (listacontactos.isEmpty()){
            System.out.println("No hay contactos en la lista.");
        }else {
            for (Contact c: listacontactos.values()){
                c.showContactDetails();
            }
        }
    }


}

