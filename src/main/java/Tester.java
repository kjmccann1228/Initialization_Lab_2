/**
 * Created by kurtmccann on 9/11/16.
 */
public class Tester {
    public static void main(String[] args) {

        ThingContainer testTC = new ThingContainer(9);



        ColorfulThing foo1 = new ColorfulThing(ColorfulThing.Color.GOLD);
        ColorfulThing foo2 = new ColorfulThing(ColorfulThing.Color.GOLD);
        ColorfulThing foo3 = new ColorfulThing(ColorfulThing.Color.GOLD);
        ColorfulThing foo4 = new ColorfulThing(ColorfulThing.Color.GOLD);
        ColorfulThing foo5 = new ColorfulThing(ColorfulThing.Color.SILVER);
        ColorfulThing foo6 = new ColorfulThing(ColorfulThing.Color.GOLD);
        ColorfulThing foo7 = new ColorfulThing(ColorfulThing.Color.GOLD);
        ColorfulThing foo8 = new ColorfulThing(ColorfulThing.Color.GOLD);
        ColorfulThing foo9 = new ColorfulThing(ColorfulThing.Color.GOLD);

        testTC.add(foo1);
        testTC.add(foo2);
        testTC.add(foo3);
        testTC.add(foo4);
        testTC.add(foo5);
        testTC.add(foo6);
        testTC.add(foo7);
        testTC.add(foo8);
        testTC.add(foo9);

        ColorfulThing foo10 = new ColorfulThing(ColorfulThing.Color.BRONZE);
        testTC.add(foo10);

//        System.out.println(foo1.getColor());
//        ColorfulThing foo11 = new ColorfulThing(ColorfulThing.Color.SILVER);
//        testTC.add(foo11);
//
        testTC.printTC();






    }
}
