public class    Bird extends Pet{
    private String color;
    
   public Bird(String color){
        this.color = color;
    }
   


  @Override
    public String communicate() {
        return "pi pi piipiipii";
    }

    @Override
    public String toString() {
        return super.toString()+String.format("""
            color: %s
            """, color);
    }
    
}
