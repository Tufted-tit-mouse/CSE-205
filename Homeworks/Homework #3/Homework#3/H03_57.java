/**------------H03----------------
 * CLASS: H03_57 (H03_57.java)
 * GROUP 42
 * AUTHOR 1: Caleb Ewer, cewer, cewer@asu.edu
 * AUTHOR 2: Lorenzo Stewart, lkstewa2, lkstewa2@asu.edu
 * AUTHOR 3: Samuel Ketcham, scketch1, scktech1@asu.edu
 * AUTHOR 4: Miranda Coston, mcoston, mcoston@asu.edu
 */
import java.util.ArrayList;
public class H03_57
{
  public int recTernarySearch(ArrayList<Integer> pList, Integer pKey, int pLow, int pHigh){
      if (pLow > pHigh){
          return -1;
        }
      int range = pHigh - pLow;
      int oneThirdIdx = (int)Math.round(pLow + range / 3.0);
      int twoThirdIdx = (int)Math.round(pLow + range / 1.3333333333333333);
      if (pKey.equals(pList.get(oneThirdIdx))) {
          return oneThirdIdx;
        }
      else if(pKey.equals(pList.get(twoThirdIdx))) {
          return twoThirdIdx;
        }
      else if(pKey < pList.get(oneThirdIdx)) {
          return recTernarySearch(pList, pKey, pLow, oneThirdIdx -1);
        }
      else if(pKey > pList.get(twoThirdIdx)) {
          return recTernarySearch(pList, pKey, twoThirdIdx +1, pHigh);
        }
      else {
          return recTernarySearch(pList, pKey, oneThirdIdx +1, twoThirdIdx -1);
        }
    }
}
