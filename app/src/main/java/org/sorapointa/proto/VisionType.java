package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum VisionType {
        @Tag(tag=0) VisionNone ,
        @Tag(tag=1) VisionMeet ,
        @Tag(tag=2) VisionReborn ,
        @Tag(tag=3) VisionReplace ,
        @Tag(tag=4) VisionWaypointReborn ,
        @Tag(tag=5) VisionMiss ,
        @Tag(tag=6) VisionDie ,
        @Tag(tag=7) VisionGatherEscape ,
        @Tag(tag=8) VisionRefresh ,
        @Tag(tag=9) VisionTransport ,
        @Tag(tag=10) VisionReplaceDie ,
        @Tag(tag=11) VisionReplaceNoNotify ,
        @Tag(tag=12) VisionBorn ,
        @Tag(tag=13) VisionPickup ,
        @Tag(tag=14) VisionRemove ,
        @Tag(tag=15) VisionChangeCostume ,
        @Tag(tag=16) VisionFishRefresh ,
        @Tag(tag=17) VisionFishBigShock ,
        @Tag(tag=18) VisionFishQteSucc ,
        @Tag(tag=19) VisionCaptureDisappear ;
}
