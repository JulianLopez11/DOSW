package maletasInteligentes;

public class BussinesFactory implements IBagsFactory {
    public BussinesBag createBussinesBag(){
        BussinesBag bussinesBag = new BussinesBag("Bussines");
        Inventory.getInstance().addBag(bussinesBag);
        return bussinesBag;
    }
    public AdventureBag createAdventureBag(){
        return null;
    }

     public TurismBag createTurismBag(){
        return null;
    }
    
}
