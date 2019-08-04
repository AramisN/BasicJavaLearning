public class DispatchYaFarakhan {
    public static void main(String args[])
    {
        // object of type A
        OverrideParent a = new OverrideParent();

        // object of type B
        OverrideChild1 b = new OverrideChild1();

        // object of type C
        OverrideChild2 c = new OverrideChild2();

        // obtain a reference of type A
        OverrideParent ref;

        // ref refers to an A object
        ref = a;

        // calling A's version of m1() method
        ref.m1();

        // now ref refers to a B object
        ref = b;

        // calling B's version of m1()
        ref.m1();

        // now ref refers to a C object
        ref = c;

        // calling C's version of m1()
        ref.m1();
    }
}
