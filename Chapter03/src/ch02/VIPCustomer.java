package ch02;

public class VIPCustomer extends Customer{
	
	private String agentId;
	double saleRatio;
	
	public VIPCustomer() {
		bonusRatio = 0.05;
		saleRatio = 0.1;
		customerGrade = "VIP";
	}

	public String getAgentId() {
		return agentId;
	}

}
