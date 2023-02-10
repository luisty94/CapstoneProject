package com.capstone.project.venturethemisadventure;

import java.util.Scanner;

public class CharacterCreator {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String userName;

        System.out.println("Name your Hero");
        userName = myObj.nextLine();

        Scanner myClass = new Scanner(System.in);
        String userClass;

        System.out.println("Choose your Class");

        userClass = myClass.nextLine();

        System.out.println("You are " + userName + " and you are a " + userClass);
    }

}