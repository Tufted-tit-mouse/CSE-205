/**------------P02----------------
 * CLASS: OnCampusStudent (OnCampusStudent.java)
 * GROUP 42
 * AUTHOR 1: Caleb Ewer, cewer, cewer@asu.edu
 * AUTHOR 2: Lorenzo Stewart, lkstewa2, lkstewa2@asu.edu
 * AUTHOR 3: Samuel Ketcham, scketch1, scktech1@asu.edu
 * AUTHOR 4: Miranda Coston, mcoston, mcoston@asu.edu
 */
 public class OnCampusStudent extends Student
{
  public OnCampusStudent(String pId, String pFirstName, String pLastName)
  {
  super(pId, pFirstName, pLastName);
  }
  private int mResident;
  private double mProgramFee;
  public int RESIDENT = 1;
  public int NON_RESIDENT = 2;

  public void setResidency(int residency)
  {
    mResident = residency;
  }
  public int getResidency()
  {
    return mResident;
  }
  public double getProgramFee()
  {
    return mProgramFee;
  }
  public void setProgramFee(double pProgramFee)
  {
    mProgramFee = pProgramFee;
  }
@Override
public void calcTuition()
{
  double t;
  if (OnCampusStudent.getResidency() = RESIDENT)
  {
    t = TuitionConstants.ONCAMP_RES_BASE;
  }
  else
  {
    t = TuitionConstants.ONCAMP_NONRES_BASE;
  }
  t = t + getProgramFee();
  if ((getCredits() > TuitionConstants.ONCAMP_MAX_CREDITS))
  {
    t= t+(getCredits()- TuitionConstants.ONCAMP_MAX_CREDITS *  TuitionConstants.ONCAMP_ADD_CREDITS);
  }
  setTuition(t);
}
}