/** Liana Ikoyan
* 002395362
* ikoyan@chapman.edu
* CPSC-231-01
* MP2_Pizza
* This class stores the data of a single pizza
*/

public class Pizza {

/** Size of the pizza */
  private String size;
/** Number of cheese toppings */
  private int numToppingsCheese;
/** Number of pepperoni toppings */
  private int numToppingsPepperoni;
/** Number of veggie toppings */
  private int numToppingsVeggie;

/** Default Constructor
* size defaults to small
*/
  public Pizza() {
    size = "small";
    numToppingsCheese = 0;
    numToppingsPepperoni = 0;
    numToppingsVeggie = 0;
  }

/**  Overloaded Constructor */
  public Pizza(String size, int numToppingsCheese, int numToppingsPepperoni, int numToppingsVeggie) {
    this.size = size;
    this.numToppingsCheese = numToppingsCheese;
    this.numToppingsPepperoni = numToppingsPepperoni;
    this.numToppingsVeggie = numToppingsVeggie;
  }

/** Copy Constructor
* creates a shallow copy of current pizza instance
*/
  public Pizza(Pizza pizza) {
    this.size = pizza.size;
    this.numToppingsCheese = pizza.numToppingsCheese;
    this.numToppingsPepperoni = pizza.numToppingsPepperoni;
    this.numToppingsVeggie = pizza.numToppingsVeggie;
  }

 /** Accessor and mutator methods for all member variables */

 public String getSize() {
   return this.size;
 }
 public void setSize(String size) {
   this.size = size;
 }

 public int getNumToppingsCheese() {
   return numToppingsCheese;
 }
 public void setNumToppingsCheese(int numToppingsCheese) {
   this.numToppingsCheese = numToppingsCheese;
 }

 public int getNumToppingsPepperoni() {
   return this.numToppingsPepperoni;
 }
 public void setNumToppingsPepperoni(int numToppingsPepperoni) {
   this.numToppingsPepperoni = numToppingsPepperoni;
 }

 public int getNumToppingsVeggie() {
   return this.numToppingsVeggie;
 }
 public void setNumToppingsVeggie(int numToppingsVeggie) {
   this.numToppingsVeggie = numToppingsVeggie;
 }

/** calcCost
* returns cost of the pizza depending on size and toppings
*/
 public double calcCost() {
   double cost = 0.0;
   int totalToppings = numToppingsCheese + numToppingsPepperoni + numToppingsVeggie;
   cost += 2.0 * totalToppings;

   if (size.equals("large") || size.equals("Large")) {
     cost += 14.0;
   }
   else if (size.equals("medium") || size.equals("Medium")) {
     cost += 12.0;
   }
   else {
     cost += 10.0;
   }
   return cost;
 }

/** toString
* returns string describing pizza when pizza object is printed
*/
 public String toString() {
   return "Size: " +  size + "\nNumber of Cheese Toppings: " + numToppingsCheese +
   "\nNumber of Pepperoni Toppings: " + numToppingsPepperoni + "\nNumber of Veggie Toppings: "
   + numToppingsVeggie + "\nCost: $" + calcCost();
 }

/** equals
* determines if two pizzas are equal
* returns true or false
*/
  public boolean equals(Pizza otherPizza) {
    if (this.size.equals(otherPizza.size) && (this.numToppingsCheese == otherPizza.numToppingsCheese) && (this.numToppingsPepperoni == otherPizza.numToppingsPepperoni) && (this.numToppingsVeggie == otherPizza.numToppingsVeggie)){
      return true;
    }
    else {
      return false;
    }
  }

}
