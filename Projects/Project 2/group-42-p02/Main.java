/**------------HW 3.6----------------
 * CLASS: H01_36 (H01_36.java)
 * GROUP 42
 * AUTHOR 1: Caleb Ewer, cewer, cewer@asu.edu
 * AUTHOR 2: Lorenzo Stewart, lkstewa2, lkstewa2@asu.edu
 * AUTHOR 3: Samuel Ketcham, scketch1, scktech1@asu.edu
 * AUTHOR 4: Miranda Coston, mcoston, mcoston@asu.edu
/**------------P02----------------
 * CLASS: Main (Main.java)
 * GROUP 42
 * AUTHOR 1: Caleb Ewer, cewer, cewer@asu.edu
 * AUTHOR 2: Lorenzo Stewart, lkstewa2, lkstewa2@asu.edu
 * AUTHOR 3: Samuel Ketcham, scketch1, scktech1@asu.edu
 * AUTHOR 4: Miranda Coston, mcoston, mcoston@asu.edu
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

//private run method - void
  private void run()
  {
    try
    {
      ArrayList<Student> studentList;
      studentList = readFile();
    }
    catch (FileNotFoundException pExcept1)
    {
      System.out.println("Sorry, could not open 'p02-students.txt' for reading. Stopping");
      System.exit(-1);
    }
    calcTuition(studentList);
    Sorter.insertionSort(studentList, Sorter.SORT_ASCENDING);
    try
    {
      writeFile(studentList);
    }
    catch (FileNotFoundException pExcept2)
    {
      System.out.println("Sorry, could not open 'p02-tuition.txt' for writing. Stopping.");
      System.exit(-1);
    }  
    
  }  
  //calc tuition method-----------------------------
 private void calcTuition(ArrayList<Student> pStudentList) 
 {
  for (Student student : pStudentList) 
    {
    student.calcTuition();
    }
  }
//-------------readFile---------------
  private ArrayList<Student> readFile()throws FileNotFoundException
  {
    ArrayList<Student> studentList = new ArrayList<Student>();
    Scanner in = new Scanner(new File("p02-students.txt"));
    while (in.hasNext())
    {
    String studentType = in.next();
      if (studentType.equals("C"))
      {
        studentList.add(readOnCampusStudent(in));
      }
      else
      {
        studentList.add(readOnlineStudent(in));
      }
    in.close();
    return studentList;
    }
  }

//private method ---readOnCampusStudent(pIn Scanner): OnCampusStudent
  private static OnCampusStudent readOnCampusStudent(Scanner pIn)
  {
    String id = new String(pIn.next());
    String lname = new String(pIn.next());
    String fname = new String(pIn.next());
    OnCampusStudent student = new OnCampusStudent(id, fname, lname);
    String res = new String(pIn.next());
    double fee =pIn.nextDouble();
    int credits = pIn.nextInt();
    if (res.equals("R"))
    {
      setResidency(1);
    }
    else
    {
      setResidency(2);
    }
    student.setProgramFee(fee);
    student.setCredits(credits);
    return student;
  }
//private method ----readOnlineStudent(pIn Scanner): OnlineStudent

  private OnlineStudent readOnlineStudent(Scanner pIn)
  {
    String id = new String(pIn.next());
    String lname = new String(pIn.next());
    String fname = new String(pIn.next());
    OnlineStudent student = new OnlineStudent(id, fname, lname);
    String fee = new String(pIn.next());
    int credits = pIn.nextInt();
    if(fee.equals("T"))
    {
      setTechFee(true);
    }
    else
    {
      setCredits(credits);
    }
    student.setCredits(credits);
    return student;
  }

//private method writeFile(pStudentList: ArrayList<Student>):void
  private static void writeFile(ArrayList<Student> pStudentList) throws FileNotFoundException
  {
    PrintWriter out = new PrintWriter ("p02-tuition.txt");
    for (Student student : pStudentList)
    {
      ///id shall be output left-justified in a field of width 16, last-name shall be output left-justified in a field of width 20, first-name shall be output left-justified in a field of width 15, and tuition shall be output right-justified in a field of width 8 with two digits after the decimal point. For the sample input file, this is the output file:
      out.printf("%-16 %-20 %15 %8.2", student.getId(), student.getLastName(), student.getFirstName(), student.getTuititon());
    }
    out.close();
  }
 
  //---------private method ArrayList<Studnet> returns in
  


public static void main(String[] pArgs)
{
  Main mainObject = new Main();
  mainObject.run();
}
}
