public class ThingTester {
    public static void main(String [] args){
        Thing t = new Thing();
        t.addThing(new Thing());
        t.addThing(t.getThing(0));
        t.getThing(0).addThing(new Thing());
        System.out.println(t);
        for(int i = 0; i < 20; i++){
            t.getThing(0).getThing(0).addThing(new Thing());
            t.getThing(0).getThing(0).getThing(i).addThing(new Thing());
            if(i % 3 == 0){
                t.addThing(new Thing());
            }
        }
        System.out.println(t);
    }
}
