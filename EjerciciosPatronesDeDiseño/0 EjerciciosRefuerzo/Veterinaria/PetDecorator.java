package veterinaria;
public abstract class PetDecorator extends Pet {
    protected Pet pet;
    public PetDecorator(Pet pet){
        this.pet = pet;
    }
    @Override
    public String getDescription() {
        return pet.getDescription();
    }
    
}
