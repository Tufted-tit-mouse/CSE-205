/**------------H03----------------
 * CLASS: H03_35 (H03_35.java)
 * GROUP 42
 * AUTHOR 1: Caleb Ewer, cewer, cewer@asu.edu
 * AUTHOR 2: Lorenzo Stewart, lkstewa2, lkstewa2@asu.edu
 * AUTHOR 3: Samuel Ketcham, scketch1, scktech1@asu.edu
 * AUTHOR 4: Miranda Coston, mcoston, mcoston@asu.edu
 */
public class H03_35
{
    public String reverse(String s){
     if (s.length() <= 1){
         return s;
    }
    else {
     return s.substring(s.length() -1) + reverse(s.substring(0, s.length() - 1));   
    }
   }
}
