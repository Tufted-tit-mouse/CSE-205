/**------------H03----------------
 * CLASS: H03_41 (H03_41.java)
 * GROUP 42
 * AUTHOR 1: Caleb Ewer, cewer, cewer@asu.edu
 * AUTHOR 2: Lorenzo Stewart, lkstewa2, lkstewa2@asu.edu
 * AUTHOR 3: Samuel Ketcham, scketch1, scktech1@asu.edu
 * AUTHOR 4: Miranda Coston, mcoston, mcoston@asu.edu
 */
import java.util.ArrayList;
public class H03_41
{
   public int recLinearSearch(ArrayList<String> pList, String pKey, int pBeginIdx, int pEndIdx){
    int pMiddle = ((pBeginIdx + pEndIdx) / 2);
       if (pBeginIdx > pEndIdx) {
         return -1;
    }
    
      if (pKey.compareTo(pList.get(pMiddle)) == 0){
        return pMiddle;
    }
    else if(pKey.compareTo(pList.get(pMiddle)) < 0){
        return recLinearSearch(pList, pKey, pBeginIdx, pEndIdx -1);
    }
    else {
        return recLinearSearch(pList, pKey, pMiddle + 1, pEndIdx);
    }
    
    
}
}
