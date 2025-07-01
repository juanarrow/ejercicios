


import java.time.LocalDate;
import java.util.Date;

/**
 * Pet
 * This class saves information about a Pet
 * It saves its name, gender, owner, birthdate and chipNumber
 */
public abstract class Pet extends Object{
    protected String name; //name of the Pet
    private Person owner; //owner of the Pet
    private String gender; //gender of the Pet
    private final Date birthdate; //birthdate of the Pet
    private String chipNumber; //chipNumber of the Pet
    
    /**
     * Pet
     * Constructor without parameters
     */
    public Pet(){
        this.birthdate = new Date(LocalDate.now().getYear(), LocalDate.now().getMonthValue()-1, LocalDate.now().getDayOfMonth());
    }

    /**
     * 
     * @param gender gender of the pet
     * @param birthdate birthdate of the pet
     */
    public Pet(String gender, Date birthdate){
        this.gender = gender;
        this.birthdate = birthdate;

    }

    /**
     * 
     * @param gender 
     * @param birthdate
     * @param name
     * @param owner
     */
    public Pet(String gender, Date birthdate, String name, Person owner){
        this(gender, birthdate);
        this.name = name;
        this.owner = owner;
    }

    /**
     * 
     * @return the name of the Pet
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @return the gender of the pet
     */
    public String getGender() {
        return gender;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    
    public String getChipNumber() {
        return chipNumber;
    }

    public Person getOwner() {
        return owner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public void setChipNumber(String chipNumber) {
        this.chipNumber = chipNumber;
    }

    public abstract String communicate();
    
    public String communicate(int times){
        String toReturnToPaco = "";
        for(int i = 0; i < times; i++){
            toReturnToPaco += this.communicate()+" ";
        }
        return toReturnToPaco;
    }

    @Override    
    public String toString() {
        return String.format("""
                Name: %s  
                Gender: %s
                Chip: %s
                Saludo: %s
                """, name, gender, chipNumber, this.communicate());        
    }

    
}
