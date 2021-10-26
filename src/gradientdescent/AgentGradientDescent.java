
package gradientdescent;

import java.util.Scanner;
import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;

public class AgentGradientDescent extends Agent {
    
    @Override
    protected void setup(){
        System.out.println("Agent's name --> "+getLocalName());
        addBehaviour(new MyOneShotBehaviour());

        System.out.println("-ENTER- to continue...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
    
    private class MyOneShotBehaviour extends OneShotBehaviour {
        
        @Override
        public void action() {
            GradientMethod GradientBasedAgent= new GradientMethod();
            GradientBasedAgent.GradientCalc();
        }
        
        @Override
        public int onEnd() {
          System.out.print("\nThe agent has executed its task...");
          myAgent.doDelete();   
          return super.onEnd();
        }
    
    }
    
    
}
