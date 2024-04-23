import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Item> menu = new ArrayList<>();

    public void getMenu() {
        for(Item item: menu){
            System.out.println("Item: " + item.getName() + " Price :" + item.getPrice());
        }
    }

    public void addItem(Item item){
        menu.add(item);
    }

    public Double getCost(){
        Double cost = 0.0;
        for(Item item: menu){
            cost += item.getPrice();
        }
        return cost;
    }
}
