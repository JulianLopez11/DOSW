package veterinaria;
public class HairDecorator extends PetDecorator {
    protected Pet pet;
    public HairDecorator(Pet pet){
        super(pet);
        this.pet = pet;
    }

    @Override
    public String getDescription(){
        return pet.getDescription() + "I was at the hairdresser ";
    }
    
    
}
