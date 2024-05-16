package ClassesCreation.Day_04_AccessorOrGetterMethods.Q1;

public class  StudentRunner {
    public static void main(String[] args) {
        Student mergen = new Student("Mergen", "Allamyardov", 11);
        mergen.setGPA(3.55);

        System.out.println(mergen.getFirstName());
        System.out.println(mergen.getGpa());

        //Second student object

        Student suray=new Student("Suray","Allamyradova",11);
        System.out.println(suray.getFirstName());

        //print 2 students independently
        System.out.println(mergen);
        System.out.println(suray);


    }
}
