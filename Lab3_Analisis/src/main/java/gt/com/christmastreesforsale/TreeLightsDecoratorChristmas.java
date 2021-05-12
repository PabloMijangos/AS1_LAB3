package gt.com.christmastreesforsale;

import java.util.*;

public class TreeLightsDecoratorChristmas extends TreeBombsDecoratorChristmas {

    public TreeLightsDecoratorChristmas(ChristmasSaleTree christmassaleTree) {
         super(christmassaleTree);
         this.addLights(christmassaleTree);
    }
  
    public void addLights(ChristmasSaleTree tree) {
     if (tree instanceof PinsapoTreeChristmas){        
          System.out.println("Decorando árbol de "
                  + "PINSAPO con Luces");
      }
      if (tree instanceof PineTreeChristmas){        
          System.out.println("Decorando árbol de "
                  + "Pino con Luces");
      }
      if (tree instanceof ChiriviscoTreeChristmas){         
          System.out.println("Decorando árbol de "
                  + "Chirivisco con Luces");
      }
      if (tree instanceof SpruceTreeChristmas){         
          System.out.println("Decorando árbol de "
                  + "Pinabete con Luces");
      }
      
      if (tree instanceof NormandianTreeChristmas){         
          System.out.println("Decorando árbol de"
                  + " NORMANDIAN con Luces");
      }
    }

}