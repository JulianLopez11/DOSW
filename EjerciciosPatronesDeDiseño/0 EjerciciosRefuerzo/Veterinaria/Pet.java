package veterinaria;
/* 
 * Diseñar un sistema que permita registrar mascotas y ofrecer distintos planes de salud. 
 * Usa Factory Method para crear mascotas (perro, gato, ave) y 
 * Decorator para añadir servicios adicionales (vacunación, peluquería, adiestramiento) - 
 * Diagramar como usar los patrones mencionados
*/

public abstract class Pet {
    public abstract String getDescription();
}
