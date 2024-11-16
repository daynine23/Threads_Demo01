package com.usil;

public class Main extends Thread{

    public static void main(String[] args) {

        Thread mainT = new Thread();
        System.out.println("El nombre del Hilo principal es : " + mainT.getName());

        mainT.setName("UserNotificationThread");

        System.out.println("* El nuevo nombre de Hilo principal es: " + mainT.getName());

        System.out.println("La prioridad del Thread es : " + mainT.getPriority());

        mainT.setPriority(10);

        System.out.println("* La nueva prioridad del Thread es: " + mainT.getPriority());

    }
}
