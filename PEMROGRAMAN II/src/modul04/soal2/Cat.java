package modul04.soal2;

public class Cat extends Pet {
    private String furColour;

    public Cat(String name, String breed, String furColour) {
        super(name, breed);
        this.furColour = furColour;
    }

    public void displayCatDetails() {
        super.display();
        System.out.println("Memiliki warna bulu: " + this.furColour);
    }
}