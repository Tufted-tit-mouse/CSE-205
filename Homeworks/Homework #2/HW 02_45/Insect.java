//******************************************************************************
// ABSTRACT CLASS: Insect (Insect.java)
//
// DESCRIPTION
// Insect is the abstract superclass for all Insect subclasses, e.g., we could
// have a LadyBug class, a Cockroach class, and a Cricket class, all of which
// inherit from Insect. The Insect class implements the MakesSound interface
// because each Insect makes a sound of some sort (we assume so, I don't know if
// all Insects make sounds).
//
// AUTHOR
// Kevin R. Burger (burgerk@asu.edu)
// Computer Science and Engineering
// Fulton Schools of Engineering
// Arizona State University
// Tempe, AZ 85287-8809
//******************************************************************************
/**------------HW 2-4.5----------------
 * CLASS: Insect (Insect.java)
 * GROUP 42
 * AUTHOR 1: Caleb Ewer, cewer, cewer@asu.edu
 * AUTHOR 2: Lorenzo Stewart, lkstewa2, lkstewa2@asu.edu
 * AUTHOR 3: Samuel Ketcham, scketch1, scktech1@asu.edu
 * AUTHOR 4: Miranda Coston, mcoston, mcoston@asu.edu
 */

/**
 * The abstract superclass for all types of Insects. Note that Insect does not
 * implement MakesSound.makeSound() because it does not have to since Insect
 * is abstract. Abstract classes do not have to implement any of the methods of
 * the class.
 */
public abstract class Insect implements MakesSound { 
} 
