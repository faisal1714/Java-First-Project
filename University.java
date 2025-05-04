public class University extends EducationalInstitude{
    int numberofDepartment;
    boolean isResearchInstitution;
    public University(String institutionName,String location,int establishedYear,int numberofDepartment, boolean isResearchInstitution) {
        super(institutionName,location,establishedYear);
        this.numberofDepartment=numberofDepartment;
        this.isResearchInstitution=isResearchInstitution;

    }

    @Override
    public void displaydetails() {
        super.displaydetails();
        System.out.println("Number of department is "+numberofDepartment);
        System.out.println("Is it research institution  "+isResearchInstitution);
    }
}
