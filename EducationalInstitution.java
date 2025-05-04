import java.time.LocalDate;

public class EducationalInstitude {
    String institutionName,location;
    int establishedYear;
    EducationalInstitude(String institutionName,String location, int establishedYear) {
        this.institutionName=institutionName;
        this.location=location;
        this.establishedYear=establishedYear;
    }
    public void displaydetails(){
        System.out.println("Institution Name: "+institutionName);
        System.out.println("Location: "+location);
        System.out.println("Established Year: "+establishedYear);
    }
    public int calculateage(){
        int currentYear = java.time.Year.now().getValue();
        return currentYear-establishedYear;
    }
}
