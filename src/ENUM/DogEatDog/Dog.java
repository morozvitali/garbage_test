package ENUM.DogEatDog;

public class Dog {
    private static int dogCount;

    public static final int PAWS = 4;
    public static final int TAIL = 1;
    private String name;
    private String breed;
    private Size size;

    public Dog(String name, String breed, Size size) {
        dogCount++;
        System.out.println("Кількість створених собак " + dogCount);
        this.name = name;
        this.breed = breed;
        this.size = size;
    }

    public static int getDogCount() {
        return dogCount;
    }

    public void setDogSize (Size size) {
        this.size = size;    }

    public Size getDogSize () {
        return size;
    }

    public void burk () {
        switch (size) {
            case BIG:
            case SMALL:
                System.out.println("woff");
                break;
            case AVERAGE:
                System.out.println("tyaff");
                break;
        }
    }



    public String getName () {
        return name;
    }
    public void setname (String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Dog buldog = new Dog("jhony", "buldog",Size.BIG);
        buldog.getDogSize();
        System.out.println("Dog's name " + buldog.name);
        buldog.setname("jhony2");
        System.out.println("Dog's name " + buldog.name);
        System.out.println(buldog.getName());
        buldog.burk();


        Dog taxa = new Dog("bony", "taxa",Size.SMALL);

        Dog toyterier = new Dog("puki", "toyterier", Size.AVERAGE);
        taxa.burk();
        System.out.println();
        toyterier.burk();
        toyterier.setDogSize(Size.BIG);
        toyterier.burk();
    }
}


