/**------------H03----------------
 * CLASS: H03_31 (H03_31.java)
 * GROUP 42
 * AUTHOR 1: Caleb Ewer, cewer, cewer@asu.edu
 * AUTHOR 2: Lorenzo Stewart, lkstewa2, lkstewa2@asu.edu
 * AUTHOR 3: Samuel Ketcham, scketch1, scktech1@asu.edu
 * AUTHOR 4: Miranda Coston, mcoston, mcoston@asu.edu
 */
public class H03_31
{

    public int sum1toN(int n)
    {
        if (n >= 1) {
         return n + sum1toN(n - 1);   
        }
        else {
            return 0;
        }
    }
}


