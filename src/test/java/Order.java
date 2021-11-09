import java.util.List;
import java.util.LinkedList;

public class Order {
	private String Owner;
	private String Recipient;
	
	public Order() {
		this.Owner = Owner;
		this.Recipient = Recipient;
	}
	
	public Order(String owner, String recipient) {
		this.Owner = owner;
		this.Recipient = recipient;
		
	}

    public void setOwner(String who) {
    this.Owner = Owner;
    }
    public void setRecipient(String who) {
    this.Recipient = Recipient;
    }
    
    public String getOwner() {
    	return this.Owner;
    }
    
    public String getRecipient() {
    	return this.Recipient;
    }
    
    public List<Order.Drink> getDrinks() { return new LinkedList<>(); }

    static class Drink {
        public Drink(String name){ }
    }

}