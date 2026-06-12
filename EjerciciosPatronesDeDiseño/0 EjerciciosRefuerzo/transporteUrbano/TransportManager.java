package transporteUrbano;
public class TransportManager {
    private TransportManager factory;
    public TransportManager(TransportManager factory){
        this.factory = factory;
    }
    public Transport registerTransport(String id){
        factory.createTransport(id);
    }
    
}
