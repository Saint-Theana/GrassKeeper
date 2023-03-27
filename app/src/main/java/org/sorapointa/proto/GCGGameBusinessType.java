package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum GCGGameBusinessType {
        @Tag(tag=0) GCGGameNone ,
        @Tag(tag=1) GCGGameGm ,
        @Tag(tag=2) GCGGameMatch ,
        @Tag(tag=3) GCGGamePvp ,
        @Tag(tag=4) GCGGameTavernChallenge ,
        @Tag(tag=5) GCGGameConstChallenge ,
        @Tag(tag=6) GCGGameWorldChallenge ,
        @Tag(tag=7) GCGGameBossChallenge ,
        @Tag(tag=8) GCGGameWeekChallenge ,
        @Tag(tag=9) GCGGameBreakChallenge ,
        @Tag(tag=10) GCGGameQuest ,
        @Tag(tag=11) GCGGameGuideGroup ,
        @Tag(tag=12) KOGBPIPKHNF ;
}
