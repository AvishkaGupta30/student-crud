
import java.util.HashMap;
import java.util.Map;

public class StudentManager 
{
    Map<Integer, Student> students = new HashMap<>();

    public void addStudents(int id, String name, int age)
    {
        if(students.containsKey(id))
        {
            System.out.println("Student of this id is already exist");
        }
        else 
        {
            Student stud = new Student();
            stud.setId(id);
            stud.setName(name);
            stud.setAge(age);
            students.put(id,stud);
            System.out.println("Student added sucssesfully");
        }
    }

    public void viewAllStudents()
    {
        if(students.isEmpty())
        {
            System.out.println("There is no record");
        }
        else 
        {
            for(Student s : students.values())
            {
                System.out.println(s);
            }
        }
    }

    public void updateStudents(int id, String newName, int age)
    {
        if(students.containsKey(id))
        {
            Student stud = students.get(id);
            if(!newName.equals(""))
            {
                stud.setName(newName);
            }
            stud.setName(newName);
            stud.setAge(age);
            System.out.println("Student updated succesfully");
        }
        else 
        {
            System.out.println("Student not found");
        }
    }

    public void deleteStudent(int id)
    {
        if(students.containsKey(id))
        {
            students.remove(id);
            System.out.println("Student delete succesfully");
        }
        else 
        {
            System.out.println("Student not found");
        }
    }
}
