package modul04.soal2;

public class Pet {
    private String name;
    private String breed;

    public Pet (String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void display() {
        System.out.println("Detail Hewan Peliharaan: ");
        System.out.println("Nama Hewan Peliharaanku adalah: " + name);
        System.out.println("Dengan ras: " + breed);
    }
}