import java.util.*;

public class Customer {
	private String name;
	private ArrayList<Bill> billList;
	public static int totalObjects = 0;

	public Customer(String name) {
		this.name = name;
		billList = new ArrayList<Bill>();
		totalObjects++;
	}

	public Customer(String name, double total) {
		this.name = name;
		billList = new ArrayList<Bill>();
		billList.add(new Bill(name, total));
	}

	public ArrayList<Bill> getBillList() {
		return billList;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		String s = "Name : " + name + "\n\nTotal Bills : " + billList.size();
		return s;
	}

	public static int getTotalObjects() {
		return totalObjects;
	}

	int totalBills() {
		int totalBill;

		totalBill = billList.size();

		return totalBill;
	}

	public double getTotalOwed() {
		double totalOwed = 0;
		for (Bill b : billList) {
			double bAmount = b.getTotal();
			totalOwed += bAmount;
		}
		return totalOwed;
	}

	public void addBill(double total) {
		Bill newBill = new Bill(name, total);
		if (getTotalOwed() < 1000) {
			billList.add(newBill);
		} else
			System.out.println("Bill not added");
	}
}


