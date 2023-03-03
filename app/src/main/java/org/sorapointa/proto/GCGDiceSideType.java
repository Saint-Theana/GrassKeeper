package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum GCGDiceSideType {
        @Tag(tag=0) GCG_DICE_SIDE_TYPE_INVALID ,
        @Tag(tag=1) GCG_DICE_SIDE_TYPE_CRYO ,
        @Tag(tag=2) GCG_DICE_SIDE_TYPE_HYDRO ,
        @Tag(tag=3) GCG_DICE_SIDE_TYPE_PYRO ,
        @Tag(tag=4) GCG_DICE_SIDE_TYPE_ELECTRO ,
        @Tag(tag=5) GCG_DICE_SIDE_TYPE_GEO ,
        @Tag(tag=6) GCG_DICE_SIDE_TYPE_DENDRO ,
        @Tag(tag=7) GCG_DICE_SIDE_TYPE_ANEMO ,
        @Tag(tag=8) GCG_DICE_SIDE_TYPE_PAIMON ;
}
