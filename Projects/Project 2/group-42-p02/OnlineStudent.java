/**------------P02----------------
 * CLASS: OnlineStudent (OnlineStudent.java)
 * GROUP 42
 * AUTHOR 1: Caleb Ewer, cewer, cewer@asu.edu
 * AUTHOR 2: Lorenzo Stewart, lkstewa2, lkstewa2@asu.edu
 * AUTHOR 3: Samuel Ketcham, scketch1, scktech1@asu.edu
 * AUTHOR 4: Miranda Coston, mcoston, mcoston@asu.edu
 */
 public class OnlineStudent extends Student
{
private boolean mTechFee;
  public OnlineStudent(String pId, String pFirstName, String pLastName)
  {
  super(pId, pFirstName, pLastName);
  }

public boolean getTechFee()
{
  return mTechFee;
}
public void setTechFee(boolean pTechFee)
{
  mTechFee = pTechFee;
}
@Override
public void calcTuition()
{
  double t = getCredits()*TuitionConstants.ONLINE_CREDIT_RATE;
  if (getTechFee() == true)
  {
    t = t + TuitionConstants.ONLINE_TECH_FEE;
  }
  setTuition(t);
}
}