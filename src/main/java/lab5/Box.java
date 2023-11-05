package lab5;
import java.util.ArrayList;

public class Box {
    private double maxWeight;
    private ArrayList<ToBeStored> contents;

    public Box(double maxWeight){
        this.maxWeight=maxWeight;
        this.contents=new ArrayList<>();
    }
    public void add(ToBeStored item){
        if(totalWeight() + item.weight() <=maxWeight){
            contents.add(item);
        }
    }
    public double totalWeight(){
        double weight = 0.0;
        for(ToBeStored item: contents){
            weight += item.weight();
        }
        return weight;
    }
    @Override
    public String toString() {
        return "Box: " + contents.size() + " things, total weight " + totalWeight() + "kg";
    }
}
