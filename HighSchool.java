public class HighSchool extends EducationalInstitude {
    String schoolType;
    int numberofStudents;
    public HighSchool(String institutionName,String location,int establishedYear,String schoolType,int numberofStudents) {
        super(institutionName,location,establishedYear);
        this.schoolType=schoolType;
        this.numberofStudents=numberofStudents;

    }

    @Override
    public void displaydetails() {
        super.displaydetails();
        System.out.println("School Type: "+schoolType);
        System.out.println("Number of Students: "+numberofStudents);
    }
}
