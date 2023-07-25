
public class Biriyani {
	String brand;
	float quantity;
	int cookingTime;
	int packetCount;
	String flavor;
	String spicyLevel;
	int price;
	public Biriyani(String brand, float quantity,  int cookingTime, int packetCount, String flavor,
			String spicyLevel, int price) {
		super();
		this.brand = brand;
		this.quantity = quantity;
		this.cookingTime = cookingTime;
		this.packetCount = packetCount;
		this.flavor = flavor;
		this.spicyLevel = spicyLevel;
		this.price = price;
	}
	void openPacket()
	{
		System.out.println(brand+" "+" branded Biriyani of a packet of "+quantity+" "+" is opened to cook ");
	}
	void cook()
	{
		System.out.println(cookingTime+" "+" minutes of time taken per different packetCount of "+packetCount);
	}
	void serve()
	{
		System.out.println(flavor+" "+" flavored Biryani with a "+spicyLevel+"spicyLevel is served of a price is "+price);
	}
	}

