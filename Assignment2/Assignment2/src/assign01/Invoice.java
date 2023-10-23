package assign01;

import java.util.Scanner;

public class Invoice {
		String partNo ;
		String partDescription ;
		int partQuantity ;
		double partPrice ;
		
		public Invoice() {
				this("0000","--",0,0.0);
		}

		public Invoice(String partNo, String partDescription, int partQuantity, double partPrice) {
			this.partNo = partNo;
			this.partDescription = partDescription;
			this.partQuantity = partQuantity;
			this.partPrice = partPrice;
		}
		
		public void acceptInvoice() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter part no. ");
			this.partNo = sc.next();
			
			System.out.print("Enter part Descriotion ");
			this.partDescription = sc.next();
			
			System.out.print("Enter part Quantity ");
			this.partQuantity = sc.nextInt();
			if(this.partQuantity < 0) {
				this.partQuantity = 0;
			}
			
			System.out.print("Enter part Price ");
			this.partPrice = sc.nextDouble();
			if(this.partPrice < 0) {
				this.partPrice = 0.0;
			}
		}
		
		public void displayInvoice(){
			System.out.println("Part number : " + this.partNo);
			System.out.println("Part discription : "+ this.partDescription);
			System.out.println("Quantity of parts  : " + this.partQuantity);
			System.out.println("Price of part  : " + this.partPrice);
			
			System.out.println("Total Amount = "+(this.partPrice*this.partQuantity));
		}

		public String getPartNo() {
			return partNo;
		}

		public void setPartNo(String partNo) {
			this.partNo = partNo;
		}

		public String getPartDescription() {
			return partDescription;
		}

		public void setPartDescription(String partDescription) {
			this.partDescription = partDescription;
		}

		public int getPartQuantity() {
			return partQuantity;
		}

		public void setPartQuantity(int partQuantity) {
			this.partQuantity = partQuantity;
		}

		public double getPartPrice() {
			return partPrice;
		}

		public void setPartPrice(double partPrice) {
			this.partPrice = partPrice;
		}
		
		
}