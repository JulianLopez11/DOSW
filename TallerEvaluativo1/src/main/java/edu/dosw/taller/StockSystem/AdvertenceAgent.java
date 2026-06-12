package edu.dosw.taller.StockSystem;

public class AdvertenceAgent implements AgentObserver {
    /**
     * Método que se ejecuta cuando el  notifica
     * un cambio en el stock de un producto.  
     * Si la cantidad disponible es menor a 5, muestra un mensaje de alerta.
     *
     * @param product el producto cuyo stock ha cambiado.
     */
    @Override
    public void updateState(Product product){
        if(product.getQuantity() < 5){
            System.out.println("Alerta!!! El stock del producto "+ product.getName() +
                    "es muy bajo, solo quedan " + product.getQuantity() + " unidades.");
        }

    }
    
}
