package bibliotecaEnLinea;
public class PyshicalLoan extends ProcessLoan{
    @Override
    protected boolean verifyDisponibility(String book){
        System.out.println("Verifying Disponibility Pyshical Book " + book);
        return true;
    }

    @Override
    protected void searchBook(String book) {
        System.out.println("Searching Pyshical Book "+ book);
    }

    @Override
    protected void deliverBook(String user, String book) {
        System.out.println("Delivering Pyshical book " + book + "To " + user);
    }
    
    
}