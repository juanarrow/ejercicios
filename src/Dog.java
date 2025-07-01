public class Dog extends Pet{
    private String breed;

    public Dog(String breed){
        this.breed = breed;
    }

    @Override
    public String communicate() {
        return "guau";
    }

    @Override
    public String toString() {
        return super.toString()+String.format("""
            Breed: %s
            """, breed);
    }
    
}
