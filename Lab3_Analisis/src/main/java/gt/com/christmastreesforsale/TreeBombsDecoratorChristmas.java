package gt.com.christmastreesforsale;

import java.util.*;

public class TreeBombsDecoratorChristmas extends TreeDecoratorChristmas {

    public TreeBombsDecoratorChristmas(ChristmasSaleTree christmassaleTree) {
         super(christmassaleTree);
         this.addTreeBombs(christmassaleTree);
    }
   
    
   
    public void addTreeBombs(ChristmasSaleTree tree) {
        if (tree instanceof PinsapoTreeChristmas){        
          System.out.println(" Se esta Haciendo la decoracion del  "
                  + "árbol  PINSAPO con  las bombas");
      }
      if (tree instanceof PineTreeChristmas){        
          System.out.println("Se esta Haciendo la decoracion del  "
                  + "árbol de Pino con bombas");
      }
      if (tree instanceof ChiriviscoTreeChristmas){         
          System.out.println("Se esta Haciendo la decoracion del "
                  + " árbol Chirivisco con bombas");
      }
      if (tree instanceof SpruceTreeChristmas){         
          System.out.println("Se esta Haciendo la decoracion del  "
                  + "árbol Pinabete con bombas");
      }
      
      if (tree instanceof NormandianTreeChristmas){         
          System.out.println("Se esta Haciendo la decoracion del  "
                  + "árbol NORMANDIAN con bombas");
      }
    }

    @Override
    public void christmassaleTree() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}