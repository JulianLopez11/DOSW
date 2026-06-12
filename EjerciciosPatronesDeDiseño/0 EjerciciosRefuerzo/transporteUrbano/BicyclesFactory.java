package transporteUrbano;

public class BicyclesFactory {
    public Transport createTransport(String id){
        return new Bicycle(id);
    }
    
}
