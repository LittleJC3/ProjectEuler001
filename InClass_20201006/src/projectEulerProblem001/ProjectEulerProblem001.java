/* Project Euler Problem 001
 * 
 * If we list all the natural numbers below 10 that are multiples of 3 or 5,
 * we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
package projectEulerProblem001;

public class ProjectEulerProblem001 {

	public static void main(String[] args) {
		// Declare a variable to contain the sum 
		int sumOfMultiples;
		// Init to zero
		sumOfMultiples = 0;
		// We want to loop from 3 to 999
		for (int i = 3; i <= 999; i++) {
			// I need to know if i is a multiple of 3 or 5. Hint: Use the % operator
			if ((i % 3 == 0) || (i % 5==0)){
				// Add i to my sum
				sumOfMultiples+= i;
				System.out.println("i = " + i); // This only prints if i is a multiple
				
			}
		}
		System.out.println(sumOfMultiples);
	}

}
