package edu.dosw.taller.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.util.*;
import edu.dosw.taller.StockSystem.Product;
import edu.dosw.taller.StockSystem.StockMonitoring;
import edu.dosw.taller.StockSystem.AdvertenceAgent;
import edu.dosw.taller.StockSystem.AgentObserver;
import edu.dosw.taller.StockSystem.LogAgent;

public class TestStockSystem {

    StockMonitoring stock = new StockMonitoring();
    @Test
    public void shouldAddProduct(){

        Product pc = new Product("Computador", "Tecnologia", 1, 2000000);
        stock.addProduct(pc);
        assertEquals(1, pc.getQuantity());
        assertEquals("Computador", pc.getName());

    }

    @Test
    public void shouldAddObservers(){
        List<AgentObserver> agents = new ArrayList<>();
        AgentObserver logAgent = new LogAgent();
        AgentObserver advertenceAgent = new AdvertenceAgent();
        agents.add(logAgent);
        agents.add(advertenceAgent);
        stock.addObservers(advertenceAgent);
        assertEquals(2, agents.size());
        

    }

    @Test
    public void shouldUpdateStock(){

        Product teclado = new Product("Teclado", "Accesorios" ,30, 999);
        stock.addProduct(teclado);
        stock.updateStock(teclado, 7);
        assertEquals(7, teclado.getQuantity());

    }

    @Test
    void notificationShouldCallAgents() {
        StockMonitoring stock = new StockMonitoring();
        Product xbox = new Product("Xbox", "Tecnologia", 10, 2000);

        stock.addProduct(xbox);

        LogAgent logAgent = new LogAgent();
        AdvertenceAgent advertenceAgent = new AdvertenceAgent();

        stock.addObservers(logAgent);
        stock.addObservers(advertenceAgent);
        stock.notification(xbox);
        stock.updateStock(xbox, 1);

    }

    
    
    
}
