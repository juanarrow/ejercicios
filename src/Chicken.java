public class Chicken extends Pet {
    private String breed;
    private String featherColor;

    public Chicken(String breed, String featherColor) {
        this.breed = breed;
        this.featherColor = featherColor;
    }


    @Override
    public String communicate() {
        return "cluck";
    }
    @Override
    public String toString() {
        return super.toString()+String.format("""
            Breed: %s
            Feather Color: %s
            """, breed, featherColor);
    }
}
