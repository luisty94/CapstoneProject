package com.capstone.project.venturethemisadventure;

import java.util.Scanner;

public class CharacterCreator {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String userName;

        System.out.println("Name your Hero");
        userName = myObj.nextLine();

        System.out.println("You are " + userName);


    }
}