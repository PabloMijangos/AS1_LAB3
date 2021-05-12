package gt.com.christmastreesforsale;

import java.util.*;

public class TreeFactoryChristmas {

    public TreeFactoryChristmas() {
    }

    public ChristmasSaleTree getTree(ChristmasTreeType treeType) {
        switch(treeType){
           case SPRUCE: return new SpruceTreeChristmas();
           case CHIRIVISCO: return new ChiriviscoTreeChristmas();
           case PINE: return new PineTreeChristmas();
           case PINSAPO: return new PinsapoTreeChristmas();
           case NORMANDIAN: return new NormandianTreeChristmas();
           default: return null;
       }
    }

}