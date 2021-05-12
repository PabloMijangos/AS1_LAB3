package gt.com.christmastreesforsale;

import java.util.*;

public class TreeRollDecoratorChristmas extends TreeDecoratorChristmas {

    public TreeRollDecoratorChristmas(ChristmasSaleTree christmassaleTree) {
        super(christmassaleTree);
        this.addTreeRoll(christmassaleTree);
    }
  
    
    public void addTreeRoll(ChristmasSaleTree tree) {
      if (tree instanceof PinsapoTreeChristmas){        
          System.out.println("Decorando el árbol de PINSAPO con rollo de navidad");
      }
      if (tree instanceof PineTreeChristmas){        
          System.out.println("Decorando el árbol de Pino con rollo de navidad");
      }
      if (tree instanceof ChiriviscoTreeChristmas){         
          System.out.println("Decorando el árbol de Chirivisco con rollo de navidad");
      }
      if (tree instanceof SpruceTreeChristmas){         
          System.out.println("Decorando el árbol de Pinabete con rollo de navidad");
      }
      
      if (tree instanceof NormandianTreeChristmas){         
          System.out.println("Decorando el árbol de NORMANDIAN con rollo de navidad");
      }
    }

    @Override
    public void christmassaleTree() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}