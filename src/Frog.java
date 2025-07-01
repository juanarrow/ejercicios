public class Frog extends Pet {
  private String type;

  public Frog(String type){
    super();
    this.type = type;
    }

    public String getTipo() {
        return type;
    }

    @Override
    public String toString() {
        return super.toString()+String.format("""
            Type: %s
            """, type);
    }
     @Override
    public String communicate() {
        return "croack";
    }
    
}
