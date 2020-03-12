public class CalculatePrice {
	private static int price,location,destination,amount = 1;
	public void setLocation(int location) {
		this.location = location;
}
	public void setAmount(int amount) {
		this.amount = amount;
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
			return price * amount;
		}
		if(location > destination){
			price = 14;
			for(int i = location - 1; i > destination;i--) {
				price += 1;
			}
			return price * amount;
		}
		return 0;
	}
	public int getOnePrice() {
		price = 14;
		for(int i = location - 1; i > destination;i--) {
			price += 1;
		}
		return price;
	}
	public int getAmount() {
		return amount;
	}
	
	
}
