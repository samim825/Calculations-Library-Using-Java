
package testing;


public class MainClass {
    
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        
        Student student = new  Student();
        student.printInfo();
        
        Class cls = Class.forName("Student.java");
        Student student1 = (Student) cls.newInstance();
        student1.printInfo();
        
        
    }
}
