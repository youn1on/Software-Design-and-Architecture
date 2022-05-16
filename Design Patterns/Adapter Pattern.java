//CoffeeMachineInterface.java

public interface CoffeMachineInterface {

public void chooseFirstSelection();

public void chooseSecondSelection();

}

//OldCoffeeMachine.java

public class OldCoffeeMachine {
public void selectA()
{
System.out.println(" A selected");
}

public void selectB()
{
System.out.println("B selected");
}
}

//CoffeeTouchscreenAdapter.java

public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {

OldCoffeeMachine theMachine;
CoffeeTouchscreenAdapter(OldCoffeeMachine newMachine)
{
theMachine = newMachine;
}

public void chooseFirstSelector()
{
theMachine.selectA();
}

public void chooseSecondSelector()
{
theMachine.selectB();
}
}