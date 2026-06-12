package sistemaViajes;
public class PlaneFactory implements ITransportFactory {
    public ITransport createTransport(){
        return new Plane();
    }
    
}
