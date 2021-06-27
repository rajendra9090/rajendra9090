package co.jsoftware;

public class Website {

	String WebName;
	int webAge;

	Website(String name, int age) {
		this.WebName = name;
		this.webAge = age;
	}

	public static void main(String[] args) {
		Website obj1 = new Website("beginnersbook", 5);
		Website obj2 = new Website("google", 18);

		System.out.println(obj1.WebName + " " + obj1.webAge);
		System.out.println(obj2.WebName + " " + obj2.webAge);
	}
}