package veterinaria;
public class Application {
    public static void main(String[] args) {
        IPetFactory dog = new DogFactory();
        Pet veterinaryDog = dog.createPet();
        veterinaryDog = new VaccinationDecorator(veterinaryDog);
        veterinaryDog = new HairDecorator(veterinaryDog);
        veterinaryDog = new TrainingDecorator(veterinaryDog);

        IPetFactory bird = new BirdFactory();
        Pet veterinaryBird = bird.createPet();
        veterinaryBird = new HairDecorator(veterinaryBird);

        IPetFactory cat = new CatFactory();
        Pet veterinaryCat = cat.createPet();
        veterinaryCat = new TrainingDecorator(veterinaryCat);

        System.out.println(veterinaryDog.getDescription());
        System.out.println(veterinaryBird.getDescription());
        System.out.println(veterinaryCat.getDescription());

    }
}