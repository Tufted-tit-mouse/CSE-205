/**------------HW 3.5----------------
 * CLASS: H01_35 (H01_35.java)
 * GROUP 42
 * AUTHOR 1: Caleb Ewer, cewer, cewer@asu.edu
 * AUTHOR 2: Lorenzo Stewart, lkstewa2, lkstewa2@asu.edu
 * AUTHOR 3: Samuel Ketcham, scketch1, scktech1@asu.edu
 * AUTHOR 4: Miranda Coston, mcoston, mcoston@asu.edu
 */
import java.util.ArrayList;
public class H01_35
{
public static ArrayList<Integer> arrayListCreate(int pLen, int pInitValue)
{
    ArrayList<Integer> ArrayList = new ArrayList<>();
    for(int i = 0; i < pLen; i++)
    {
        ArrayList.add(pInitValue);
    }
    return ArrayList;
}
}

