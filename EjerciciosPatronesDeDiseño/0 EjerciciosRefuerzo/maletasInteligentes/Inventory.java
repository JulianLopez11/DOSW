package maletasInteligentes;
import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private static Inventory instance;
    private List<AbstractBag> bags;

    private Inventory() {
        bags = new ArrayList<>();
    }

    public static Inventory getInstance() {
        if(instance == null){
            instance = new Inventory();
        }
        return instance;
    }

    public void addBag(AbstractBag bag) {
        bags.add(bag);
    }

    public void showInventory() {
        System.out.println("Inventario de maletas:");
        for (AbstractBag bag : bags) {
            System.out.println(bag.getDescription());
        }
    }
}
