package veterinaria;
public class CatFactory implements IPetFactory {
    public Cat createPet(){
        System.out.println("CREATING A CAT... ");
        return new Cat();
    }
    
}
