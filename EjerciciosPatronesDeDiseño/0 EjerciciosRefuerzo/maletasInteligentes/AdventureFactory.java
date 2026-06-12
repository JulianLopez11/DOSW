package maletasInteligentes;

public class AdventureFactory implements IBagsFactory {
    public AdventureBag createAdventureBag(){
        AdventureBag adventureBag = new AdventureBag("Adventure");
        Inventory.getInstance().addBag(adventureBag);
        return adventureBag;
    }

    public BussinesBag createBussinesBag(){
        return null;
    }

     public TurismBag createTurismBag(){
        return null;
    }
}