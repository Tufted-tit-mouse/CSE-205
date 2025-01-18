/**------------P02----------------
 * CLASS: Student (Student.java)
 * GROUP 42
 * AUTHOR 1: Caleb Ewer, cewer, cewer@asu.edu
 * AUTHOR 2: Lorenzo Stewart, lkstewa2, lkstewa2@asu.edu
 * AUTHOR 3: Samuel Ketcham, scketch1, scktech1@asu.edu
 * AUTHOR 4: Miranda Coston, mcoston, mcoston@asu.edu
 */
public abstract class Student implements Comparable<Student> 
{
  private int mCredits;
  private String mFirstName;
  private String mId;
  private String mLastName;
  private double mTuititon;
  public Student(String pId, String pFirstName, String pLastName)
  {
   mId = pId;
   mFirstName = pFirstName;
   mLastName = pLastName;
  }
  public int getCredits()
  {
    return mCredits;
  }
  public void setCredits(int Credits)
  {
    this.mCredits = Credits;
  }
  public String getFirstName()
  {
    return mFirstName;
  }
  public String getId()
  {
    return mId;
  } 
  public String getLastName()
  {
    return mLastName;
  }
  public double getTuititon()
  {
    return mTuititon;
  }
  public void setFirstName(String pFirstName)
  {
    this.mFirstName = pFirstName;
  }
  public void setId(String pId)
  {
    this.mId = pId;
  }
  public void setLastName(String pLastName)
  {
    this.mLastName = pLastName;
  }
  protected void setTuition(double pTuition)
  {
    mTuititon = pTuition; 
  }
  public abstract void calcTuition();
  @Override
     public int compareTo(Student pStudent) 
     {
     return getId().compareTo(pStudent.getId());
     }
}    