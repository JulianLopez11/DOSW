package edu.dosw.taller.StockSystem;

/**
 * @author  Julian Lopez
 */
public interface AgentObserver {

    /**
     * Método invocado automáticamente por el sistema de monitoreo
     * cuando un producto cambia su estado.
     *
     * @param product el producto que ha cambiado (por ejemplo, su stock).
     */
    public void updateState(Product product);
}
