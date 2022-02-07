package ENUM.DogEatDog;
// ENUM

public enum Size {
    BIG("XL"),
    AVERAGE("XM"),
    SMALL("XS");

    Size(String abbrevation) {
    this.abbrevation = abbrevation;
    }

    private String abbrevation;
    public String getAbbrevation () {
        return abbrevation;
    }
}
