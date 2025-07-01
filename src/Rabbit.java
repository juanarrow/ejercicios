public class Rabbit extends Pet {
    private String color;

    public Rabbit(String color) {
        this.color = color;
    }

    @Override
    public String communicate() {
        return "carrot";
    }

    @Override
    public String toString() {
        return super.toString() + String.format("""
                Color: %s
                """, color);
    }
}
