package maletasInteligentes;

public class TurismFactory implements IBagsFactory {
    public TurismBag createTurismBag(){
        TurismBag turismBag = new TurismBag("Turism");
        Inventory.getInstance().addBag(turismBag);
        return turismBag; 
    }

    public BussinesBag createBussinesBag(){
        return null ;
    }
    public AdventureBag createAdventureBag(){
        return null;
    }

}
