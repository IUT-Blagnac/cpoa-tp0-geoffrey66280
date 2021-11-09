import java.util.List;
import java.util.LinkedList;

public class Order {
	private List<Drink> contents = new LinkedList<>();
	public List<Drink> getDrinks() { return contents; }
	private String Owner;
	private String Recipient;
	private String owner;
	public void setOwner(String who) { this.owner = who; }

	private String recipient;
	public void setRecipient(String who) { this.recipient = who; }
	@Override
	public String toString() {
	    return "Order: " + owner + " / " + recipient + " / { " + contents + "}";
	}
	
	public Order() {
		this.Owner = Owner;
		this.Recipient = Recipient;
	}
	
	public Order(String owner, String recipient) {
		this.Owner = owner;
		this.Recipient = recipient;
		
	}

   
    public String getOwner() {
    	return this.Owner;
    }
    
    public String getRecipient() {
    	return this.Recipient;
    }
    
   

    static class Drink {
    	public Drink(String name){ this.name = name; }
        private String name;
        public String getName() { return name; }
        @Override public String toString() { return name; }
        
    
    	
    	
    	public void setName(String who) {
    		this.name = who;
    	}
    }

}