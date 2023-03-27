package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum InteractType {
        @Tag(tag=0) InteractNone ,
        @Tag(tag=1) InteractPickItem ,
        @Tag(tag=2) InteractGather ,
        @Tag(tag=3) InteractOpenChest ,
        @Tag(tag=4) InteractOpenStatue ,
        @Tag(tag=5) InteractConsum ,
        @Tag(tag=6) InteractMpPlayReward ,
        @Tag(tag=7) InteractView ,
        @Tag(tag=8) InteractGeneralReward ,
        @Tag(tag=9) InteractMiracleRing ,
        @Tag(tag=10) InteractFoundation ,
        @Tag(tag=11) InteractEchoShell ,
        @Tag(tag=12) InteractHomeGather ,
        @Tag(tag=13) InteractEnvAnimal ,
        @Tag(tag=14) InteractQuestGadget ,
        @Tag(tag=15) InteractUiInteract ,
        @Tag(tag=16) InteractDeshretObelisk ;
}
