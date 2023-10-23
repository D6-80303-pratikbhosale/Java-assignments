package assign01;

public class InvoiceTest {

	public static void main(String[] args) {
		
		Invoice i1 = new Invoice();
		i1.displayInvoice();
		i1.acceptInvoice();
		i1.displayInvoice();
		i1.setPartPrice(500);
		System.out.println("new price :"+i1.getPartPrice());
	}

}