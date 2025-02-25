//******************************************************************************
// ABSTRACT CLASS: Mammal (Mammal.java)
//
// DESCRIPTION
// Mammal is the abstract superclass for all Mammal subclasses, e.g., we could
// have a Dog class, a Cat class, and a Cow class, all of which inherit from
// Mammal. The Mammal class implements the MakesSound interface because each
// Mammal makes a sound of some sort (we assume so, I don't know if all Mammals
// make sounds).
//
// AUTHOR
// Kevin R. Burger (burgerk@asu.edu)
// Computer Science and Engineering
// Fulton Schools of Engineering
// Arizona State University
// Tempe, AZ 85287-8809
//******************************************************************************
/**------------HW 2-4.5----------------
 * CLASS: Mammel (Mammel.java)
 * GROUP 42
 * AUTHOR 1: Caleb Ewer, cewer, cewer@asu.edu
 * AUTHOR 2: Lorenzo Stewart, lkstewa2, lkstewa2@asu.edu
 * AUTHOR 3: Samuel Ketcham, scketch1, scktech1@asu.edu
 * AUTHOR 4: Miranda Coston, mcoston, mcoston@asu.edu
 */

/**
 * The abstract superclass for all types of Mammals. Note that Mammal does not
 * implement MakesSound.makeSound() because it does not have to since Mammal
 * is abstract. Abstract classes do not have to implement any of the methods of
 * the class.
 */
public abstract class Mammal implements MakesSound { 
} 
