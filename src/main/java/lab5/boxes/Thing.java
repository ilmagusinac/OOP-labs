package lab5.boxes;

public class Thing {
    private String name;
    private int weight;

    public Thing(String name, int weight){
        if(weight<0){
            throw new IllegalArgumentException("Weight cannot be negative");
        }
        this.name=name;
        //this.weight=weight;
    }

    public Thing(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getWeight(){
        return weight;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Thing thing = (Thing) o;
        return name.equals(thing.name);
    }

}
