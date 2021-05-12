package gt.com.christmastreesforsale;

import java.util.*;

public abstract class TreeDecoratorChristmas implements ChristmasSaleTree {
     protected ChristmasSaleTree christmassaleTree;
     
    public TreeDecoratorChristmas(ChristmasSaleTree christmassaleTree ) {
        this.christmassaleTree= christmassaleTree;
    }
    
    
    public void ChristmasWoodTree() {
       christmassaleTree.christmassaleTree();
        
    }

}