package maletasInteligentes;

public class Application {
    public static void main(String[] args) {
        IBagsFactory adventureFactory = new AdventureFactory();
        IBagsFactory bussinesFactory = new BussinesFactory();
        IBagsFactory turismFactory = new TurismFactory();

        adventureFactory.createAdventureBag();
        bussinesFactory.createBussinesBag();
        turismFactory.createTurismBag();
        Inventory.getInstance().showInventory();
    }
}
