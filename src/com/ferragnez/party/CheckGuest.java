package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String guestName;

    String[] guests = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
        "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };

    System.out.println("Inserire il proprio nome");
    guestName = sc.nextLine();

    System.out.println(guestName);
  }
}
