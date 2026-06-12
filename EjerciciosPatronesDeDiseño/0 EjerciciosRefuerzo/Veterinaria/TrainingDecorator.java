package veterinaria;
public class TrainingDecorator extends PetDecorator {
    protected Pet pet;
    public TrainingDecorator(Pet pet){
        super(pet);
        this.pet = pet;
    }
    
    @Override
    public String getDescription(){
        return pet.getDescription() + "I was at a training ";
    }
    
}
