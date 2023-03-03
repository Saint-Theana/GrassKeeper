package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum ResinCostType {
        @Tag(tag=0) RESIN_COST_TYPE_NONE ,
        @Tag(tag=1) RESIN_COST_TYPE_NORMAL ,
        @Tag(tag=2) RESIN_COST_TYPE_CONDENSE ,
        @Tag(tag=3) RESIN_COST_TYPE_REUNION_PRIVILEGE ,
        @Tag(tag=4) RESIN_COST_TYPE_OP_ACTIVITY ,
        @Tag(tag=5) RESIN_COST_TYPE_MATERIAL ;
}
