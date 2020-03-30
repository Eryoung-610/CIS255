import java.util.*;

public class Bill {
	private String id;
	private double total; // amount owed on the bill

	public Bill(String id, double total) {
		this.id = id;
		this.total = total;
	}

	public String getId() {
		return id;
	}

	public double getTotal() {
		return total;
	}
	
}