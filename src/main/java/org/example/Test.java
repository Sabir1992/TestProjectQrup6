package org.example;

public class Test {

public static void test(){

    String text = "Sabir ";    //    text.length()  =  5
    String text2 = "sabir";
    String text3 = "Sabir\nTahirli\nEldar";


    System.out.println( "Sabir sozunun uzunlugu = " + text.length());
    System.out.println( "Sabir sozunun uzunlugu = " + text2.length());

        System.out.println("Stringin 3cu simvolu = " + text.charAt(3));

        System.out.println("Stringin 3cu simvolu = " + text.charAt(text.length()-1));

    System.out.println(text.toUpperCase());
    System.out.println(text.toLowerCase());

    System.out.println(text.trim());

    System.out.println("blank " + text.isBlank());
    System.out.println("empty " + text.isEmpty());

    System.out.println("startsWith = " + text.startsWith("Sabi"));
    System.out.println("endsWith = " + text.endsWith("Sabir"));

    System.out.println("contains = " + text.contains("abi"));

    System.out.println("equals = " + text.equals(text2));
    System.out.println(text.trim().equals(text2));

    System.out.println("equalsIgnoreCase = " + text2.equalsIgnoreCase(text.trim()));

    System.out.println(text.replace("bir", "1"));

    System.out.println(text.repeat(5));

    String position = "QA";

    System.out.println(text.concat(position));

    position = "Fehle";

    System.out.println(text.concat(position));

    System.out.println(position + " " + text);

    System.out.println(String.join("_", "Sabir","Tahirli","Eldar"));
}
}
