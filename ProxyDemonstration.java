package pt1;

public class ProxyDemonstration {

	public static void main(String[] args) {
		Listing listing = new ProxyListing("test listing: Jacob, Alexandra, Dimitri, Quincy");
		
		listing.print();
		System.out.println("");
		
		listing.print();
	}

}
