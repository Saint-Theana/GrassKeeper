package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum GCGReason {
        @Tag(tag=0) GCGReasonDefault ,
        @Tag(tag=1) GCGReasonEffect ,
        @Tag(tag=2) GCGReasonCost ,
        @Tag(tag=3) GCGReasonGm ,
        @Tag(tag=4) GCGReasonAttack ,
        @Tag(tag=5) gCGReasonReboot ,
        @Tag(tag=6) gCGReasonPlayCard ,
        @Tag(tag=7) gCGReasonQuicklyOnstage ,
        @Tag(tag=8) gCGReasonRemoveAfterDie ,
        @Tag(tag=9) GCGReasonInit ,
        @Tag(tag=10) gCGReasonDamage ,
        @Tag(tag=11) gCGReasonHeal ,
        @Tag(tag=12) gCGReasonRevive ,
        @Tag(tag=13) ODGPMCHEPJN ,
        @Tag(tag=14) MHHLAMICEFA ,
        @Tag(tag=15) BHLECCJIPIJ ,
        @Tag(tag=16) NCCIDJECGCO ;
}
