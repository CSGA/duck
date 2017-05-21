package duck.model;

public class RedheadDuck extends Duck{
	   public RedheadDuck() {
		      quackBehavior = new Quack();
		      flyBehavior = new FlyWithWings();
		   }
}
