/**------------HW 3.4----------------
 * CLASS: H01_34 (H01_34.java)
 * GROUP 42
 * AUTHOR 1: Caleb Ewer, cewer, cewer@asu.edu
 * AUTHOR 2: Lorenzo Stewart, lkstewa2, lkstewa2@asu.edu
 * AUTHOR 3: Samuel Ketcham, scketch1, scktech1@asu.edu
 * AUTHOR 4: Miranda Coston, mcoston, mcoston@asu.edu
 */
import java.util.ArrayList;
public class H01_34
{
public static int arrayListSum(ArrayList<Integer> pList)
{
    int sum = 0;
    int empty = 0;
    for (int i = 0;i < pList.size(); i++)
    {
        if (pList.get(i) == null)
        {
            return empty;
        }
        sum+=pList.get(i);
    }
    return sum;
}
}
