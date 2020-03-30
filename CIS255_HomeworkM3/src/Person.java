public class Person {
	private String name;
	private String address;
	private int age;
	private String phoneNumber;

	public Person(String newName, String newAddress, int newAge) {
		name = newName;
		address = newAddress;
		age = newAge;
	}

	public String toString() {
		String s = name + "\n" + address + "\n" + age;
		return s;
	}

	public void vote() {
		System.out.println(name + " is voting.");
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public int getAge() {
		return age;
	}

	public boolean canVote(int age) {
		return age >= 18;
	}
}