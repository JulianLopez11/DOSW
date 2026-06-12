package edu.dosw.taller.StockSystem;

public class LogAgent implements AgentObserver {
    @Override
    public void updateState(Product product){
        System.out.println("Producto: " + product.getName() +
                " -> " + product.getQuantity() +" unidades disponibles");
        

    }
    
}
