package ch02;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer();
		
		customerLee.setCustomerName("이순신");
		customerLee.setCustomerId(10010);
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer();
		
		customerKim.setCustomerName("Kim");
		customerKim.setCustomerId(10020);
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
	}
	
}
