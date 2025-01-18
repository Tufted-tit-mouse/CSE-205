/**------------HW 3.6----------------
 * CLASS: H01_36 (H01_36.java)
 * GROUP 42
 * AUTHOR 1: Caleb Ewer, cewer, cewer@asu.edu
 * AUTHOR 2: Lorenzo Stewart, lkstewa2, lkstewa2@asu.edu
 * AUTHOR 3: Samuel Ketcham, scketch1, scktech1@asu.edu
 * AUTHOR 4: Miranda Coston, mcoston, mcoston@asu.edu
 */
import java.util.ArrayList;
public class H01_36
{
 public static void pList(ArrayList<String> pList, String pName)
{
for (int i=0; i < pList.size(); i++)
{
   if (pName.compareToIgnoreCase(pList.get(i)) < 0)
 {
    pList.add(i,pName);
 }
  else if (pName.compareToIgnoreCase(pList.get(i)) > 0)
  {
      pList.add(i+1,pName);
  }
  else
  {
      System.out.println("Hey, I think these are the same names!");
  }
}
}
}
