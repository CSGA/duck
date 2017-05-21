package duck.test;

import static org.junit.Assert.*;

import org.junit.Test;

import duck.model.*;


public class DuckSimulator {

	@Test
	public void test() {
	      Duck mallard = new MallardDuck();
	      System.out.println("MallardDuck can quack as");
	      mallard.performQuack();
	      System.out.println("MallardDuck can");
	      mallard.performFly();
	      System.out.println("Make MallardDuck quack like");
	      mallard.setQuackBehavior(new Squeak());
	      mallard.performQuack();

	   }


}
