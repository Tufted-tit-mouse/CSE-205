//******************************************************************************
// CLASS: Cat (Cat.java)
//
// DESCRIPTION
// Cat is a subclass of Mammal. Remember that if D is a subclass of C, then a D
// is a specific type of C, so Cat is a specific type of Mammal.
//
// AUTHOR
// Kevin R. Burger (burgerk@asu.edu)
// Computer Science and Engineering
// Fulton Schools of Engineering
// Arizona State University
// Tempe, AZ 85287-8809
//******************************************************************************
/**------------HW 2-4.5----------------
 * CLASS: Cat (Cat.java)
 * GROUP 42
 * AUTHOR 1: Caleb Ewer, cewer, cewer@asu.edu
 * AUTHOR 2: Lorenzo Stewart, lkstewa2, lkstewa2@asu.edu
 * AUTHOR 3: Samuel Ketcham, scketch1, scktech1@asu.edu
 * AUTHOR 4: Miranda Coston, mcoston, mcoston@asu.edu
 */

/**
 * Cat is a specific type of Mammal so Cat inherits from Mammal. Mammal and Cat
 * are related using a generalization (or inheritance) relationship. Note that
 * Mammal implements the MakesSound interface, so since Cat is a subclass of
 * Mammal (which is an abstract class) then Cat must implement the MakesSound
 * interface by implementing the MakesSound.makeSound() method. (If Cat does not
 * do this, then Cat also becomes an abstract class).
 */
public class Cat extends Mammal {

    /**
     * Mammal is an abstract class and does not implement the MakesSound.
     * makeSound() method. However, since Cat is a concrete subclass of Mammal
     * then Cat must implement makeSound(). The sound Cats make is "Meow".
     *
     * Note also that Cat is overridng the abstract makeSound() method
     * of Mammal. Therefore, to prevent accidental overloading, we use the
     * @Override annotation.
     */
	@Override
	public void makeSound() { 
		System.out.println("Meow");
	} 
} 
