
public class Lab01_example03 {

	public static void main(String[] args) {
		
		String module = "CSC1009";
		switch(module)
		{
		case"CSC1006":
			System.out.println("Mathematics 2");
			break;
		case"CSC1007":
			System.out.println("Operating Systems");
			break;
		case"CSC1008":
			System.out.println("Data Structure and Algorithms");
			break;
		case"CSC1009":
			System.out.println("Object-Oriented Programming");
			break;
		case"CSC1010":
			System.out.println("Computer Networks");
			break;
		default:
			System.out.println("Unknown Module");
			break;
		}
		
		System.out.println("After switch");
				

	}

}
