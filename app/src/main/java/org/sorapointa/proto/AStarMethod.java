package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum AStarMethod {
        @Tag(tag=0) aStarMethodClassic ,
        @Tag(tag=1) aStarMethodTendency ,
        @Tag(tag=2) aStarMethodAdaptive ,
        @Tag(tag=3) aStarMethodInflection ;
}
