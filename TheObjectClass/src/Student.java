class Student {
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " is " + age + " years old.";
        // return "Student [name=" + name + ", age=" + age + "]";
    }

    /*
     * public String toString() {
     * return super.toString();
     * }
     */

}
