package pt1;

public class RealListing implements Listing {
	private String listingName;
	
	public RealListing(String listingName) {
		this.listingName = listingName;
		loadLocalDisk(listingName);
	}
	private void loadLocalDisk(String listingName) {
		System.out.println("Information loaded from local disk" + listingName);
		
	}
	public void print() {
		System.out.println("The listing is as follows:" + listingName);
		
	}

}
