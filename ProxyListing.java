package pt1;

public class ProxyListing implements Listing {
	private RealListing realListing;
	private String listingName;
	
	public ProxyListing(String listingName) {
		this.listingName = listingName;
	}
	public void print() {
		if(realListing == null) {
			realListing = new RealListing (listingName);
		}
		realListing.print();
	}

}
