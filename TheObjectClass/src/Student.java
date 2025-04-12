class Student {
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String string, String string2, String string3, String string4) {
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return name + " is " + age + " years old.";
        // return "Student [name=" + name + ", age=" + age + "]";
    }

    public String getName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getName'");
    }

    public void setClassList(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setClassList'");
    }

    /*
     * public String toString() {
     * return super.toString();
     * }
     */

}
