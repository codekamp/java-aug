package codekamp;

/**
 * Created by cerebro on 22/08/18.
 */

// Think of interface like a list of criterias/requirements
// We can create variables of interface but not objects.
// In a variable of interface Xyz you can store objects of
// ... any class that implements Xyz interface.

// Implementing an Inteface means satisfying the criterias
// ... defined by Interface. i.e. defining all the
// ... incomplete methods listed in interface.
public interface MyActionListner {

    public void actionPerformed(String s);

    public int hello();
}
