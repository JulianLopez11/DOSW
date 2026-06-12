package maletasInteligentes;

public abstract class AbstractBag{
    private String type;
    public AbstractBag(String type){
        this.type = type;   
    }

    public String getDescription(){
        return "Maleta de tipo " + type;
    }
    
}