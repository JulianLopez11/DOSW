package sistemaViajes;
public class Application {
    public static void main(String[] args){
        TravelSystem trip1 = new TravelSystem(new PlaneFactory(), new HotelStrategy());
        trip1.createPlan();

        TravelSystem trip2 = new TravelSystem(new BusFactory(), new HostelStrategy());
        trip2.createPlan();

        TravelSystem trip3 = new TravelSystem(new TrainFactory(), new CampStrategy());
        trip3.createPlan();
        
    }
    
}
