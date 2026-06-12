package veterinaria;
public class BirdFactory implements IPetFactory {
    public Bird createPet(){
        System.out.println("CREATING A BIRD... ");
        return new Bird();
    }
    
}
