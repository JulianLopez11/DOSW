package bibliotecaEnLinea;
public class ProxyDigitalBook implements IDigitalBook {
    private RealDigitalBook realDigitalBook;
    private String book;
    public ProxyDigitalBook(String book){
        this.book = book;
    }

    @Override
    public void seeBookContent(String user){
        if(realDigitalBook == null){
            realDigitalBook = new RealDigitalBook(book);
        }
        realDigitalBook.seeBookContent(book);
    }
    
}
