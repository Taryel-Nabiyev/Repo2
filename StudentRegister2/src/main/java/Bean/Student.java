package Bean;

public class Student extends Person {
    private String schoolName;
    private double scholarship;
    
    public String getschoolName(){
        return this.schoolName;
    }
    
    public void setschoolName(String schoolName){
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname();
    }
    
    public double getscholarship(){
        return this.scholarship;
    }
    
    public void setscholarship(double scholarship){
        this.scholarship = scholarship;
    }
}
