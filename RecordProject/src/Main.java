public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            LPAStudent s = new LPAStudent("S92300" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonymous";
                    },
                    switch (i) {
                        case 1 -> "05/11/1985";
                        case 2 -> "06/12/1985";
                        case 3 -> "07/13/1985";
                        case 4 -> "08/14/1985";
                        case 5 -> "09/15/1985";
                        default -> "01/01/1985";
                    },
                    switch (i) {
                        case 1 -> "Java Masterclass";
                        case 2 -> "Python Basics";
                        case 3 -> "SQL Advanced";
                        case 4 -> "AWS Cloud Computing";
                        case 5 -> "Algorithms";
                        default -> "Principles of Programming";
                    });

            System.out.println(s);
        }

        Student pojoStudent = new Student("S923006", "Ann", "10/11/1985", "Object Oriented Programming");

        LPAStudent recorStudent = new LPAStudent("S923007", "Bill", "11/11/1985", "System Programming");

        System.out.println(pojoStudent);
        System.out.println(recorStudent);

        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());

        System.out.println(recorStudent.name() + " is taking " + recorStudent.classList());

        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829.");

        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());

        /*
         * recorStudent.classList(recorStudent.classList()+", Java OCP Exam 829"); this
         * line doesn't execute. we cannot set values to record directly. We can only
         * pass values using constructors.
         */
    }
}
