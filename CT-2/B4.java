//Java Program using @Override, @Deprecated, @SuppressWarnings
class Base {
    public void display() {
        System.out.println("Display from Base");
    }

    @Deprecated
    public void oldMethod() {
        System.out.println("Old method (Deprecated)");
    }
}

class Derived extends Base {
    @Override
    public void display() {
        System.out.println("Display from Derived");
    }

    @SuppressWarnings("deprecation")
    public void useOldMethod() {
        oldMethod(); // Won’t show compiler warning due to @SuppressWarnings
    }
}

public class AnnotationDemo {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.display();          // Uses @Override method
        d.useOldMethod();     // Calls @Deprecated method
    }
}
