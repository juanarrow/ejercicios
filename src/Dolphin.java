public class Dolphin extends Pet{
    private String color;
    
   public Dolphin(String color){
        this.color = color;
    }
   


  @Override
    public String communicate() {
        return "pi pi piipiipii";
    }

    @Override
    public String toString() {
        return super.toString()+String.format("""
            Breed: %s
            """, color);
    }
    
}
