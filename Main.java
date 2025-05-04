public class Main{
    public static void main(String[] args) {
        HighSchool s1 = new HighSchool("IIUC School And College","Kumira",2010,"Private",150);
        HighSchool s2 = new HighSchool("Patiya Model High School","Patiya",1847,"Private",700);
        University u1 = new University("International Islamic University Chittagong","Kumira", 2005,10,false);
        University u2 = new University("East Delta University","Nasirabad",2015,10,false);
        s1.displaydetails();
        System.out.println("Age: "+s1.calculateage());
        s2.displaydetails();
        System.out.println("Age: "+s2.calculateage());
        u1.displaydetails();
        System.out.println("Age: "+u1.calculateage());
        u2.displaydetails();
        System.out.println("Age: "+u2.calculateage());

    }
}
