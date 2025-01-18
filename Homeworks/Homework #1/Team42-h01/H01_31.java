/**------------HW 3.1----------------
 * CLASS: H01_31 (H01_31.java)
 * GROUP 42
 * AUTHOR 1: Caleb Ewer, cewer, cewer@asu.edu
 * AUTHOR 2: Lorenzo Stewart, lkstewa2, lkstewa2@asu.edu
 * AUTHOR 3: Samuel Ketcham, scketch1, scktech1@asu.edu
 * AUTHOR 4: Miranda Coston, mcoston, mcoston@asu.edu
 */
import java.util.ArrayList;
public class H01_31 
{ 
 public H01_31() 
 { 
 } 
 
 public ArrayList<Integer> arrayListInit() 
 {

 ArrayList<Integer> list = new ArrayList<>();

 for(int i = 0;i < 2; i++){
    for(int j = 0;j < 5; j++)
 {
     list.add(j);
    }
}

 return list;
 }
}

