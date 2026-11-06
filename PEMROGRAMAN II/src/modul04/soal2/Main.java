package modul04.soal2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih jenis hewan yang ingin diinputkan:");
        System.out.println("1 = Kucing");
        System.out.println("2 = Anjing");
        System.out.print("Masukkan pilihan: ");
        int option = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nama hewan peliharaan: ");
        String name = scanner.nextLine();
        System.out.print("Ras: ");
        String breed = scanner.nextLine();

        if (option == 1) {
            System.out.print("Warna Bulu: ");
            String furColour = scanner.nextLine();
            Cat cat = new Cat(name, breed, furColour);
            cat.displayCatDetails();

        } else if (option == 2) {
            System.out.print("Warna Bulu: ");
            String furColour = scanner.nextLine();

            System.out.print("Kemampuan : ");
            String[] abilities = scanner.nextLine().split(",");

            Dog dog = new Dog(name, breed, furColour, abilities);
            dog.displayDogDetails();
        }
    }
}