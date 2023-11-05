package lab5.boxes;

public class BlackHoleBox extends Box {
    @Override
    public void add(Thing thing) {
        // Anything can be added, but nothing will be found
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return false;
    }
}