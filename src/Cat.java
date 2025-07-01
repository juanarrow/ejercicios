public class Cat extends Pet{
 
    private String breed;

    public Cat(String breed){
        super();
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String toString() {        
        return super.toString()+String.format("""
                Breed: %s
                """, breed);

    }

    @Override
    public String communicate() {
        return "miau";
    }
}
