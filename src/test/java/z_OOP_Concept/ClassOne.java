package z_OOP_Concept;

public class ClassOne implements Teachable, Moveable {

    // int size = 0;

    @Override
    public void teachMath() {
        System.out.println( Teachable.size);
    }

    @Override
    public void moveTo() {

    }
}
