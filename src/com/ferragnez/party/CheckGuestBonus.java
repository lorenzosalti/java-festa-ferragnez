package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuestBonus {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String guestName;

    String[] guests = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
        "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };

    System.out.println("Inserire il proprio nome");
    guestName = sc.nextLine().replaceAll("\\s+", "").toLowerCase();

    boolean isInvited = false;
    int i = 0;

    while (!isInvited && i < guests.length) {

      String currentGuest = guests[i].replaceAll("\\s+", "").toLowerCase();

      if (currentGuest.equals(guestName)) {
        isInvited = true;
      }
      i++;
    }

    if (isInvited) {
      System.out.println("Ciao, ti do il benvenuto a questa esclusiva festa a casa Ferragnez.");
    } else {
      System.out.println("Mi spiace, ma non sei sulla lista. Torna da TonyEffe.");
    }

    sc.close();
  }
}
