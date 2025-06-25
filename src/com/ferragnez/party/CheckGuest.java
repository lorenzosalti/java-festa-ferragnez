package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String guestName;

    String[] guests = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
        "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };

    System.out.println("Inserire il proprio nome");
    guestName = sc.nextLine().replaceAll("\\s+", "").toLowerCase();

    for (int i = 0; i < guests.length; i++) {

      String currentGuest = guests[i].replaceAll("\\s+", "").toLowerCase();

      if (currentGuest.equals(guestName)) {
        System.out.println("Ciao " + guests[i] + ", ti do il benvenuto a questa esclusiva festa a casa Ferragnez.");
        break;
      } else if (i == guests.length - 1) {
        System.out.println("Mi spiace Coso, ma non sei sulla lista. Torna da TonyEffe.");
      }

    }

  }
}
