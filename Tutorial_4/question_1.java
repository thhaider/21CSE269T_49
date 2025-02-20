class University {
    private String universityName;

    // Constructor
    public University(String name) {
        this.universityName = name;
    }

    // Static nested class
    static class Library {
        private String libraryName;

        // Constructor
        public Library(String name) {
            this.libraryName = name;
        }

        // Method to display library name
        public void displayLibraryName() {
            System.out.println("Library Name: " + libraryName);
        }
    }

    // Inner class
    class Department {
        private String departmentName;

        // Constructor
        public Department(String name) {
            this.departmentName = name;
        }

        // Method to display department name
        public void displayDepartmentName() {
            System.out.println("Department Name: " + departmentName);
        }
    }

    public static void main(String[] args) {
        // Creating an instance of the static nested class Library
        University.Library library = new University.Library("Central Library");
        library.displayLibraryName();

        // Creating an instance of the outer class University
        University university = new University("XYZ University");

        // Creating an instance of the inner class Department
        University.Department department = university.new Department("Computer Science");
        department.displayDepartmentName();
    }
}
