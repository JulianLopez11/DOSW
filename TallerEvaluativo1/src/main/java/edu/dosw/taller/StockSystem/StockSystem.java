package edu.dosw.taller.StockSystem;

public class StockSystem {

    public static void ejecutar(){

        StockMonitoring monitoring = new StockMonitoring();

        Product xbox = new Product("xbox one s", "Tecnologia",10, 1000000);

        monitoring.addProduct(xbox);

        AgentObserver logAgent = new LogAgent();
        AgentObserver advertenceAgent = new AdvertenceAgent();

        monitoring.addObservers(logAgent);
        monitoring.addObservers(advertenceAgent);
        monitoring.notification(xbox);
        System.out.println("---- Actualizando stock ----");
        monitoring.updateStock(xbox,4);  
    }


}
    
