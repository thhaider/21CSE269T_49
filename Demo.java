// Constructor Overloading 
class Student {
    int id;
    String name;

    // Default Constructor
    Student() {
        System.out.println("Default Constructor");
    }

    // Parameterized Constructor
    Student(int i, String name) {
        this.id = i;
        this.name = name;
    }
}

class Demo {
    public static void main(String args[]) {
        // Creating an object using the default constructor
        Student obj = new Student();
        System.out.println(obj.id + " " + obj.name); // Will print: "0 null"

        // Creating an object using the parameterized constructor
        Student obj1 = new Student(10, "abc");
        System.out.println(obj1.id + " " + obj1.name); // Will print: "10 abc"
    }
}
