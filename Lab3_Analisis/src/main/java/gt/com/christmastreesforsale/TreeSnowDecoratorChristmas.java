package gt.com.christmastreesforsale;

import java.util.*;

public class TreeSnowDecoratorChristmas extends TreeDecoratorChristmas {

    public TreeSnowDecoratorChristmas(ChristmasSaleTree christmassaleTree) {
             super(christmassaleTree);
             this.addTreeSnow(christmassaleTree);
    }
    
    public void addTreeSnow(ChristmasSaleTree tree) {
       if (tree instanceof PinsapoTreeChristmas){        
          System.out.println("Decorando árbol de PINSAPO con Nieve");
      }
      if (tree instanceof PineTreeChristmas){        
          System.out.println("Decorando árbol de Pino con Nieve");
      }
      if (tree instanceof ChiriviscoTreeChristmas){         
          System.out.println("Decorando árbol de Chirivisco con Nieve");
      }
      if (tree instanceof SpruceTreeChristmas){         
          System.out.println("Decorando árbol de Pinabete con Nieve");
      }
      
      if (tree instanceof NormandianTreeChristmas){         
          System.out.println("Decorando árbol de NORMANDIAN con Nieve");
      }
    }

    @Override
    public void christmassaleTree() {
        
    }

}