package modul04.soal2;

public class Dog extends Pet {
    private String furColour;
    private String[] abilities;

    public Dog(String name, String breed, String furColour, String[] abilities) {
        super(name, breed);
        this.furColour = furColour;
        this.abilities = abilities;
    }

    public void displayDogDetails() {
        super.display();
        System.out.println("Memiliki warna bulu : " + this.furColour);

        System.out.print("Memiliki kemampuan : ");
        for (String ability : abilities) {
            System.out.print(ability + " ");
        }
    }
}