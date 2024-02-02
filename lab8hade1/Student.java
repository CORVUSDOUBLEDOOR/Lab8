package lab8hade1;

public class Student {
    private int id;
    private String name;
    private double gpa;
    public Student (int id, String name, double gpa){
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }
    public String getName(){
        return name;
    }
    public String checkStatus(){
        if(gpa >= 2){
            return "Normal";
        }else if(gpa < 2 && gpa > 1.75){
            return "Probation";
        }else{
            return "Retired";
        }
    }
    public String getType(){
        String ID = String.valueOf(id);
        if (ID.charAt(2) == '1') {
            return "Day";
        }else if(ID.charAt(2) == '6'){
            return "Special";
        }else{
            return "ID is wrongs";
        }
    }

}
