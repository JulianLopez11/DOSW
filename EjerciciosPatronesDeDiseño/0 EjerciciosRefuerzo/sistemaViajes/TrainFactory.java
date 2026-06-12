package sistemaViajes;
public class TrainFactory implements ITransportFactory {
    public ITransport createTransport(){
        return new Train();
    }
    
}
