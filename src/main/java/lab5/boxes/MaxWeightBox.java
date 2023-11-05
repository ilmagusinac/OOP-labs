package lab5.boxes;

public class MaxWeightBox extends Box{
    private int maxWeight;
    private Thing thing;

    public MaxWeightBox(int maxWeight){
        this.maxWeight=maxWeight;
        this.thing=null;
    }

    @Override
    public void add(Thing thing){
        if(this.thing==null & thing.getWeight() <= maxWeight){
            this.thing=thing;
        }
    }

    @Override
    public boolean isInTheBox(Thing thing){
        return this.thing != null & this.thing.equals(thing);
    }
}
