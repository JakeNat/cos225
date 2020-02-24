
public class TaxonomyTester {

	public static void main(String[] args) {
		Animal Nick1 = new Animal("Nick");
		System.out.println(Nick1);
		Family Nick2 = new Family("Nick","Black",30,50,80);
		System.out.println(Nick2);
		Tigris Nick3 = new Tigris("Nick");
		System.out.println(Nick3);
		
		System.out.println(" ");
		
		Animal Max1 = new Animal("Max");
		System.out.println(Max1);
		Family Max2 = new Family("Max","Black",15,10,60);
		System.out.println(Max2);
		Leo Max3 = new Leo("Max",10,4);
		System.out.println(Max3);
		
		System.out.println(" ");
		
		Animal Lionel1 = new Animal("Lionel");
		System.out.println(Lionel1);
		Family Lionel2 = new Family("Lionel","Orange",25,20,50);
		System.out.println(Lionel2);
		Leo Lionel3 = new Leo("Lionel");
		System.out.println(Lionel3);
	}
}
