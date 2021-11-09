import java.util.List;
import java.util.LinkedList;

public class Order {

    public void setOwner(String who) { /* ...*/ }
    public void setRecipient(String who) { /* ...*/ }
    public List<Order.Drink> getDrinks() { return new LinkedList<>(); }

    static class Drink {
        public Drink(String name){ }
    }

}