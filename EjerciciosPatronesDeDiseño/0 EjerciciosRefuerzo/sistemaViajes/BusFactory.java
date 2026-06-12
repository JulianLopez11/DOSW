package sistemaViajes;
public class BusFactory implements ITransportFactory {
    public ITransport createTransport(){
        return new Bus();
    }
    
}
