/**------------H03----------------
 * CLASS: H03_33 (H03_33.java)
 * GROUP 42
 * AUTHOR 1: Caleb Ewer, cewer, cewer@asu.edu
 * AUTHOR 2: Lorenzo Stewart, lkstewa2, lkstewa2@asu.edu
 * AUTHOR 3: Samuel Ketcham, scketch1, scktech1@asu.edu
 * AUTHOR 4: Miranda Coston, mcoston, mcoston@asu.edu
 */
public class H03_33
{
  public double powerFaster(double x, int n)
    {
        if (n == 0){
            return 1;
        }
        else if ((n % 2 ) == 0) {
            double pow = powerFaster(x, n/2);
            return pow * pow;
        }
        else {
            return (x * powerFaster(x, n -1));
        }
        
    }
}
