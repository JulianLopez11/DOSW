package sistemaViajes;
/*
 * Plataforma de viajes
Crear un sistema que ofrezca transporte (bus, avión, tren) y alojamiento (hotel, hostal, camping). 
Combina Abstract Factory con Strategy para definir los distintos paquetes de viaje - 
Diagramar como usar los patrones mencionados
 */
public class TravelSystem{
    private IAccomodationStrategy accomodation;
    private ITransportFactory transport;
    public TravelSystem(ITransportFactory transport, IAccomodationStrategy accomodation){
        this.transport = transport;
        this.accomodation = accomodation;
    }

    public void createPlan(){
        ITransport transportOption = transport.createTransport();
        transportOption.defineTransport();
        accomodation.defineAccomodation();
    }
}