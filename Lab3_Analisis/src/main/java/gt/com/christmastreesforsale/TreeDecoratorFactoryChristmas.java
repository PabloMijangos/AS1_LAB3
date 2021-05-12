package gt.com.christmastreesforsale;

import java.util.*;

public class TreeDecoratorFactoryChristmas {

    public TreeDecoratorFactoryChristmas() {
    }

    public TreeDecoratorChristmas getDecorator(DecoratorTypeChristmas decoratorType,ChristmasSaleTree christmastreeType) {
        switch(decoratorType){
           case BRICHO: return new TreeBrichoDecorator(christmastreeType);
           case BOMBS: return new TreeBombsDecoratorChristmas(christmastreeType);
           case ROLL: return new TreeRollDecoratorChristmas(christmastreeType);
           case SNOW: return new TreeSnowDecoratorChristmas(christmastreeType);
           case LIGHTS: return new TreeLightsDecoratorChristmas(christmastreeType);
           default: return null;
       }
    }

}