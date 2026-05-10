class Outer {

    class Inner {
        void display() {
            System.out.println("Inside Inner Class");
        }
    }
}

public class NestedClassDemo {
    public static void main(String[] args) {

        Outer obj = new Outer();

        Outer.Inner in = obj.new Inner();

        in.display();
    }
}