class Test {
    int a, b;

    // Constructor
    Test(int i, int j) {
        a = i;
        b = j;
    }

    // Method to modify values
    void meth(Test obj) {
        obj.a *= 2;
        obj.b /= 2;
    }
}

class Demo {
    public static void main(String args[]) {
        Test ob = new Test(15, 20);
        
        // Display original values
        System.out.println("Before method call: " + ob.a + " " + ob.b);
        
        // Modify values using method
        ob.meth(ob);
        
        // Display modified values
        System.out.println("After method call: " + ob.a + " " + ob.b);
    }
}
