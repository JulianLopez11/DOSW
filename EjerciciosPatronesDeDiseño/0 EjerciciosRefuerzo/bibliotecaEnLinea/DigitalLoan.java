package bibliotecaEnLinea;
public class DigitalLoan extends ProcessLoan{

    @Override
    protected boolean verifyDisponibility(String book) {
        System.out.println("Verifying Disponibility Digital Book " + book);
        return true;
    }

    @Override
    protected void searchBook(String book) {
        System.out.println("Searching Digital Book " + book);
    }

    @Override
    protected void deliverBook(String user, String book){
        System.out.println("Delivering Digital Book ");
        IDigitalBook newBook = new ProxyDigitalBook(book);
        newBook.seeBookContent(user);
    }
    
}