//Shallow Clonning
public class ShallowClonableDemo {
    public static void main(String[] args) {
        Demo d = new Demo(5);
        First original = new First(d, 10);

        try {
            // Shallow cloning
            First cloned = (First) original.clone();
            // Modifying the cloned object
            cloned.setB(20);
            cloned.getD().setA(7); // This change will reflect in the original object

            // Output values of both original and cloned objects
            System.out.println("Original B Value: " + original.getB());
            System.out.println("Cloned B Value: " + cloned.getB());
            System.out.println("Original Demo A Value: " + original.getD().getA());
            System.out.println("Cloned Demo A Value: " + cloned.getD().getA());

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}


class Demo implements Cloneable {
    private int a;

    public Demo(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class First implements Cloneable {
    private Demo d;
    private int b;

    public First(Demo d, int b) {
        this.d = d;
        this.b = b;
    }

    public Demo getD() {
        return d;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // Performs shallow cloning
    }
}

