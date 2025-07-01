public class  Snake extends Pet{
    
     private String move;

    public Snake (String move){
        this.move = move;
    }

    public String toString() {        
        return super.toString()+String.format("""
                Move: %s
                """, move);
    }

    @Override
    public String communicate (){
        return "sssssss";
    }
}