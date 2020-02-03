
public class CalculatePrice {
	private static int price,location,destination;
	public void setLocation(int location) {
		this.location = location;
}
	public void setDestination(int destination) {
			this.destination = destination;
	}
	public int getLocation() {
		return location;
	}
	public int getDestination() {
		return destination;
	}
	public int getPrice() {
		if(location < destination) {
			price = 14;
			for(int i = location + 1; i < destination;i++ ) {
				price += 1;
			}
			return price;
		}
		if(location > destination){
			price = 14;
			for(int i = location - 1; i > destination;i--) {
				price += 1;
			}
			return price;
		}
		return 0;
	}
	
}
