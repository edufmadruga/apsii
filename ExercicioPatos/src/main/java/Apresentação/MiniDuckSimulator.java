package Apresentação;
import patos.Duck;
import patos.MallardDuck;
import patos.ModelDuck;
import voos.FlyRocketPowered;

public class MiniDuckSimulator {
	public static void main(String[] args) {
		Duck Mallard = new MallardDuck();
		Mallard.performQuack();
		Mallard.performFly();
		
		Duck Model = new ModelDuck();
		Model.performFly();
		Model.setFlyBehavior(new FlyRocketPowered());
		Model.performFly();;
	}
}
