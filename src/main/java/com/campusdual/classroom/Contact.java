package com.campusdual.classroom;


import java.text.Normalizer;

public class Contact implements ICallActions{
    private String name;
    private String surnames;
    private String number;
    private String code;

    public Contact(String name, String surnames, String number) {
        this.name = name;
        this.surnames = surnames;
        this.number = number;
        this.code = generateCode(name, surnames);
    }

    private String generateCode(String name, String surnames) {
        String normalized = Normalizer.normalize(surnames.toLowerCase(), Normalizer.Form.NFD)
                .replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
        String[] parts = normalized.split(" ");
        StringBuilder codeBuilder = new StringBuilder();
        codeBuilder.append(Character.toLowerCase(name. charAt(0)));
        if (parts.length == 1) {
            codeBuilder.append(parts[0]);
        } else {
            codeBuilder.append(parts [0].charAt(0));
            for (int i =1; i <parts.length; i ++ ){
                codeBuilder.append(parts[i]);
            }
        }
        return codeBuilder.toString();
    }

    @Override
    public void callMyNumber() {
        System.out.println("Te estás llamando a ti mismo: " );
        System.out.println("Nombre: " + name);
        System.out.println("Apellidos: " + surnames);
        System.out.println("Número: " + number);
    }

    @Override
    public void callOtherNumber(String number) {
        System.out.println("Llamando al número: " + number);
        System.out.println("Desde el contacto: " + " " + "Nombre: " +name + " " + "Apellidos: " + surnames);

    }

    @Override
    public void showContactDetails() {
        System.out.println("Nombre: " + name);
        System.out.println("Apellidos: " + surnames);
        System.out.println("Número : " + number);
        System.out.println("Código: " + code);
    }

    public CharSequence getName() {
        return name;
    }

    public CharSequence getSurnames() {
        return surnames;
    }

    public CharSequence getPhone() {
        return number;
    }

    public String getCode() {
        return code;
    }

}


