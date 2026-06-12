package bibliotecaEnLinea;
public abstract class ProcessLoan{
    public void doLoan(String user, String book){
        searchBook(book);
        if (verifyDisponibility(book)){
            deliverBook(user, book);
            confirmLoan(user, book);
        }else{
            System.out.println("The book isn´t availbale ");
        }

    }
    protected void confirmLoan(String usuario, String book){
        System.out.println("Loan Confirm to " + usuario + "with the book: " + book);
    }

    protected abstract boolean verifyDisponibility(String book);
    protected abstract void searchBook(String book);
    protected abstract void deliverBook(String user, String book);
    
}