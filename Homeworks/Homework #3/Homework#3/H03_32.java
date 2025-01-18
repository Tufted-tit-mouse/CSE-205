/**------------H03----------------
 * CLASS: H03_32 (H03_32.java)
 * GROUP 42
 * AUTHOR 1: Caleb Ewer, cewer, cewer@asu.edu
 * AUTHOR 2: Lorenzo Stewart, lkstewa2, lkstewa2@asu.edu
 * AUTHOR 3: Samuel Ketcham, scketch1, scktech1@asu.edu
 * AUTHOR 4: Miranda Coston, mcoston, mcoston@asu.edu
 */
public class H03_32
{
    public double power(double x, int n)
    {
        if (n == 0){
            return 1;
        }
        else {
            return (x * power(x, n -1));
        }
    }
}
