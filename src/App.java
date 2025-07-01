import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class App {
    
    public static void main(String[] args) throws Exception {
        int opcion = -1;

        Cat cat1 = new Cat("Persa");
        cat1.getName();
        
        System.out.print(cat1);
        ArrayList<Pet> mascotas = new ArrayList<Pet>();
        do{
            System.out.println("1. Añadir mascota");
            System.out.println("2. Modificar mascota");
            System.out.println("3. Borrar mascota");
            System.out.println("4. Listar mascotas");
            System.out.println("4. Salir");
            opcion = Integer.parseInt(System.console().readLine());
            
            switch(opcion){
                case 1:{
                    Pet pet = null;
                    
                    System.out.print("Perro o gato? (p/g)");
                    String animal = System.console().readLine();
                    if(animal.toUpperCase().charAt(0)=='P')
                        pet = new Dog("Pastor alemán");    
                    else if(animal.toUpperCase().charAt(0)=='G')
                        pet = new Cat("Persa");
                    else{
                        System.out.print("Introduzca un tipo de animal correcto");
                    }
                    if(pet != null){
                        System.out.print("Introduzca el chip de la mascota: ");
                        pet.setChipNumber(System.console().readLine());
                        mascotas.add(pet);
                    }                                                                            
                }
                break;
                case 2:{
                    Pet pet;
                    System.out.print("Indica el chip de la mascota: ");
                    String chip = System.console().readLine();
                    int index = -1;
                    boolean encontrado = false;
                    for(int i = 0;i<mascotas.size() && !encontrado;i++){
                        if(mascotas.get(i).getChipNumber().equals(chip)){
                            encontrado = true;
                            index = i;
                        }
                    }
                    if(encontrado){
                        pet = mascotas.get(index);
                        System.out.print("Introduzca el nombre (intro para continuar): ");
                        String name = System.console().readLine();
                        if(!name.equals("")){
                            pet.setName(name);
                        }

                        System.out.print("Introduzca el género (m/h) (intro para continuar): ");
                        String gender = System.console().readLine();
                        if(!gender.equals("")){
                            if(gender.toUpperCase().equals("M") ||
                               gender.toUpperCase().equals("H")){
                                pet.setGender(gender);
                            }
                            else{
                                System.out.print("Género erróneo");
                            }                            
                        }
                    }
                }
                break;
                case 3:
                    System.out.print("Indica el chip de la mascota: ");
                    String chip = System.console().readLine();
                    int index = -1;
                    boolean encontrado = false;
                    for(int i = 0;i<mascotas.size() && !encontrado;i++){
                        if(mascotas.get(i).getChipNumber().equals(chip)){
                            encontrado = true;
                            index = i;
                        }
                    }
                    if(encontrado){
                        System.out.print(mascotas.get(index));
                        System.out.println("Esta seguro que desea eliminarla?(S/N)");
                        String yesno = (""+System.console().readLine().toUpperCase().charAt(0));
                        if(yesno.equals("S"))
                            mascotas.remove(index);                        
                    }
                    else{
                        System.out.println("Lo siento, la mascota no está en nuestros archivos");
                    }
                    break;
                case 4:
                    System.out.println("**************************");
                    System.out.println("*****LISTADO MASCOTAS*****");
                    System.out.println("**************************");
                    for(int i = 0;i<mascotas.size();i++){
                        System.out.print(mascotas.get(i));
                        System.out.println("---------------------------");
                        System.out.println("Esta mascota se comunica así: "+ mascotas.get(i).communicate((int)(Math.random()*10 + 1)));
                    }
                    break;
                case 5:
                    System.out.println("Hasta luego");
                    break;
                default:
            }
        } while (opcion != 5);
        
        
    }
}
