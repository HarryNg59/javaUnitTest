import java.time.LocalDate;

public class Person {
    private String fullName;
    private int yOB;

    public Person() {
    }

    public Person(String fullName, int yOB) {
        this.fullName = fullName;
        this.yOB = yOB;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setyOB(int yOB) {
        this.yOB = yOB;
    }

    public int getyOB() {
        return yOB;
    }
    
    public int getAge() {
        return (LocalDate.now().getYear() - this.getyOB() + 1);
    }

    public boolean checkAge(){
        int age = this.getAge();

        if(age < Constants.MIN_AGE - 1){
            return false;
        }else if(age >= Constants.MIN_AGE && age <= Constants.MAX_AGE){
            return true;
        }else return false;
    }
}
