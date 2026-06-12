package bibliotecaEnLinea;
public class Application {
    public static void main(String[] args) {
        System.out.println("---Loan 1--- ");
        ProcessLoan physhicalLoan = new PyshicalLoan();
        physhicalLoan.doLoan("Julian ", "Harry Potter");
        System.out.println("---Loan 2---");
        ProcessLoan digitalLoanTest = new DigitalLoan();
        digitalLoanTest.doLoan("Camilo ", "100 Años De Soledad");

    }    
}
