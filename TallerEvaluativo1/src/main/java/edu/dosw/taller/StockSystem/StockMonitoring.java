package edu.dosw.taller.StockSystem;

import java.util.*;

/**
 * @author  Julian Lopez
 */
public class StockMonitoring {

    private List<Product> products = new ArrayList<>();
    private List<AgentObserver> observers = new ArrayList<>();

    /**
     * Agrega un nuevo producto al sistema de monitoreo.
     *
     * @param product el producto que se desea agregar.
     */
    public void addProduct(Product product) {
        products.add(product);
    }

    /**
     * Registra un nuevo observador que recibirá notificaciones
     * cuando cambie el estado de un producto.
     *
     * @param observer el observador a registrar.
     */
    public void addObservers(AgentObserver observer) {
        observers.add(observer);
    }

    /**
     * Notifica a todos los observadores registrados sobre el cambio
     * en el estado de un producto.
     *
     * @param product el producto que ha cambiado de estado.
     */
    public void notification(Product product) {
        for (AgentObserver observer : observers) {
            observer.updateState(product);
        }
    }

    /**
     * Actualiza el stock de un producto y notifica a los observadores 
     * registrados acerca del cambio.
     *
     * @param product  el producto cuyo stock será actualizado.
     * @param quantity la nueva cantidad disponible del producto.
     */
    public void updateStock(Product product, int quantity) {
        product.setQuantity(quantity);
        notification(product);
    }
}
