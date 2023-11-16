import java.util.*;
public class Thing{
    ArrayList<Thing> list;
    public Thing(){
        list = new ArrayList<Thing>();
    }

    public void addThing(Thing t){
        list.add(t);
    }

    public Thing getThing(int index){
        return list.get(index);
    }
    
    public String toString() {
        return list.toString();
    }
}