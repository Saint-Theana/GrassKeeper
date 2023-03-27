package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum GCGZoneType {
        @Tag(tag=0) gCGZoneInvalid ,
        @Tag(tag=1) gCGZoneDeck ,
        @Tag(tag=2) gCGZoneHand ,
        @Tag(tag=3) gCGZoneCharacter ,
        @Tag(tag=4) gCGZoneModify ,
        @Tag(tag=5) gCGZoneSummon ,
        @Tag(tag=7) gCGZoneAssist ,
        @Tag(tag=8) gCGZoneOnstage ,
        @Tag(tag=9) gCGZoneRule ;
}
