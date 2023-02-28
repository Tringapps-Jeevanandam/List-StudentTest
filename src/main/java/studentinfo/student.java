package studentinfo;


class student {
    String name;
    int age;
    double gpa;

    student(String name, int age, double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setGpa(double gpa){
        this.gpa = gpa;
    }
    
    public String getName(){
        return name;
    }
    public String getAge(){
        return Integer.toString(age);
    }
    public String getGpa(){
        return Double.toString(gpa);
    }
}