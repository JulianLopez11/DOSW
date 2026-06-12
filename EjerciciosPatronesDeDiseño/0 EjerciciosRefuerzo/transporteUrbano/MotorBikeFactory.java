package transporteUrbano;

public class MotorBikeFactory {
    public Transport createTransport(String id){
        return new MotorBike(id);
    }     
}
