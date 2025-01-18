//******************************************************************************
// CLASS: Dog (Dog.java)
//
// DESCRIPTION
// Dog is a subclass of Mammal. Remember that if D is a subclass of C, then a D
// is a specific type of C, so Dog is a specific type of Mammal.
//
// AUTHOR
// Kevin R. Burger (burgerk@asu.edu)
// Computer Science and Engineering
// Fulton Schools of Engineering
// Arizona State University
// Tempe, AZ 85287-8809
//******************************************************************************
/**------------HW 2-4.5----------------
 * CLASS: Dog (Dog.java)
 * GROUP 42
 * AUTHOR 1: Caleb Ewer, cewer, cewer@asu.edu
 * AUTHOR 2: Lorenzo Stewart, lkstewa2, lkstewa2@asu.edu
 * AUTHOR 3: Samuel Ketcham, scketch1, scktech1@asu.edu
 * AUTHOR 4: Miranda Coston, mcoston, mcoston@asu.edu
 */

/**
 * Dog is a specific type of Mammal so Dog inherits from Mammal. Mammal and Dog
 * are related using a generalization (or inheritance) relationship. Note that
 * Mammal implements the MakesSound interface, so since Dog is a subclass of
 * Mammal then Dog must implement the MakesSound interface by implementing the
 * MakesSound.makeSound() method. (If Dog does not do this, then Dog also becomes
 * an abstract class).
 */
public class Dog extends Mammal {

    /**
     * Mammal is an abstract class and does not implement the MakesSound.
     * makeSound() method. However, since Dog is a concrete subclass of Mammal
     * then Dog must implement makeSound(). The sound Dogs make is "Bark".
     *
     * Note also that Dog is overridng the abstract makeSound() method
     * of Mammal. Therefore, to prevent accidental overloading, we use the
     * @Override annotation.
     */
	@Override
	public void makeSound() { 
		System.out.println("Bark");
	} 
} 
