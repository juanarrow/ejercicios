 public class Turtle extends Pet{
    private String speed;

    public Turtle (String speed) {  
        super();
        this.speed = speed;
    }

    public String toString (){
        return super.toString () + String.format ("""
        speed: %s""");
    }

    public String getSpeed() {
        return speed;
    }
    
    @Override
    public String communicate() {
        return "taca";
    }
}
