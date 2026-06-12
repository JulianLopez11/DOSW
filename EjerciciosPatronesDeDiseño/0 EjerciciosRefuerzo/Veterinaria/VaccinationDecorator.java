package veterinaria;

public class VaccinationDecorator extends PetDecorator {
    protected Pet pet;
    public VaccinationDecorator(Pet pet){
        super(pet);
        this.pet = pet;
    }
    
    @Override
    public String getDescription(){
        return pet.getDescription() + "Im vaccinated :( ";
    }
}
