package bibliotecaEnLinea;
public class RealDigitalBook implements IDigitalBook {
    private String book;
    public RealDigitalBook(String book){
        this.book = book;
    }
    @Override
    public void seeBookContent(String user){
        System.out.println("User " + user + " have loan " + book);
    }
}
