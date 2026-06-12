package veterinaria;
public class DogFactory implements IPetFactory  {
    public Dog createPet(){
        System.out.println("CREATING A DOG... ");
        return new Dog();
    }
    
}
