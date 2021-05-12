package gt.com.christmastreesforsale;

import java.util.*;

public class SaleChristmasTreeFacade {
    private List<ChristmasSaleTree> salechristmasTrees;
      
    public SaleChristmasTreeFacade() {
        TreeFactoryChristmas treeFactory = new TreeFactoryChristmas();
        this.salechristmasTrees = new ArrayList();
        this.salechristmasTrees.add(treeFactory.getTree(ChristmasTreeType.SPRUCE));
        this.salechristmasTrees.add(treeFactory.getTree(ChristmasTreeType.CHIRIVISCO));
        this.salechristmasTrees.add(treeFactory.getTree(ChristmasTreeType.PINE));
        this.salechristmasTrees.add(treeFactory.getTree(ChristmasTreeType.PINSAPO));
        this.salechristmasTrees.add(treeFactory.getTree(ChristmasTreeType.NORMANDIAN));
        
    }
    public void DecorateTrees(){
        TreeDecoratorFactoryChristmas decoradorFactory = new TreeDecoratorFactoryChristmas();
        
        for (ChristmasSaleTree tree: this.salechristmasTrees){
            
            TreeDecoratorChristmas treDecoratorBricho = decoradorFactory.getDecorator(DecoratorTypeChristmas.BRICHO, tree);
            treDecoratorBricho.christmassaleTree();
            TreeDecoratorChristmas treDecoratorBombs = decoradorFactory.getDecorator(DecoratorTypeChristmas.BOMBS, tree);
            TreeDecoratorChristmas treDecoratorLights = decoradorFactory.getDecorator(DecoratorTypeChristmas.LIGHTS, tree);
            TreeDecoratorChristmas treDecoratorSnow = decoradorFactory.getDecorator(DecoratorTypeChristmas.SNOW, tree);
            TreeDecoratorChristmas treDecoratoRoll = decoradorFactory.getDecorator(DecoratorTypeChristmas.ROLL, tree);
        }
        
    }

   

}