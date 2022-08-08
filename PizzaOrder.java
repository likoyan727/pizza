/** Liana Ikoyan
* 002395362
* ikoyan@chapman.edu
* CPSC-231-01
* MP2_Pizza
* This class stores the data of an order of multiple pizzas
*/

public class PizzaOrder {

/** number of pizzas in the order */
  private int m_numPizzas;
/** array that stores all pizzas in the order */
  private Pizza[] m_order;

/** Default Constructor */
  public PizzaOrder() {
    m_numPizzas = 0;
    m_order = m_order;
  }

/** Overloaded Constructor */
  public PizzaOrder(int numPizzas) {
    m_numPizzas = numPizzas;
    Pizza[] array = new Pizza[numPizzas];
    m_order = array;
  }

/** addPizza
* takes in pizza object as parameter
* adds pizza object to pizza array if it can
* returns the 1 if successfully added, returns -1 if unsuccessful
*/
  public int addPizza(Pizza pizza) {
    for (int i=0; i < m_numPizzas; ++i) {
      if (this.m_order[i] != null) {
        continue;
      }
      else if (this.m_order[i] == null){
        this.m_order[i] = pizza;
        return 1;
      }
    }
    return -1;
  }

/** calcTotal
* adds up prices of all pizzas in the order
* returns the total cost
*/
  public double calcTotal() {
    double totalCost = 0.0;
    for (int i=0; i < m_numPizzas; ++i){
      if (m_order[i] != null){
        totalCost += m_order[i].calcCost();
      }
    }
    return totalCost;
  }

/** toString
* returns string describing the order
*/
  public String toString() {
    double total = calcTotal();
    return "Number of Pizzas: " + m_numPizzas + "\nTotal Cost of Order: $" + total;
  }


}
