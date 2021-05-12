package gt.com.christmastreesforsale;

import java.util.*;

public class TreeBrichoDecorator extends TreeDecoratorChristmas {

    public TreeBrichoDecorator(ChristmasSaleTree christmassaleTree) {
            super(christmassaleTree);
    }

    @Override
    public void christmassaleTree() {
        this.christmassaleTree.christmassaleTree();
        this.BRICHO(christmassaleTree);
        
    }
    public void BRICHO(ChristmasSaleTree tree) {
      if (tree instanceof PinsapoTreeChristmas){        
          System.out.println("Se esta colocando el  árbol de tipo  Ciprés");
      }
      if (tree instanceof PineTreeChristmas){        
          System.out.println("Se esta colocando el  árbol de tipo Pino");
      }
      if (tree instanceof ChiriviscoTreeChristmas){         
          System.out.println("Se esta colocando el  árbol de tipo Chirivisco");
      }
      if (tree instanceof SpruceTreeChristmas){         
          System.out.println("Se esta colocando el  árbol de tipo Pinabete");
      }
      
      if (tree instanceof NormandianTreeChristmas){         
          System.out.println("Se esta colocando el  árbol de tipo Pinidae");
      }
            
    }

}