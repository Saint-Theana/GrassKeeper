package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGTCTavernInfoNotify {
    public enum BJPECKHGPIC {
        @Tag(tag=0) None ,
        @Tag(tag=7206) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=3) public Boolean isOwnerInDuel = null;
    @Tag(tag=9) public Integer elementType = null;
    @Tag(tag=15) public Integer pointId = null;
    @Tag(tag=2) public Boolean isLastDuelWin = null;
    @Tag(tag=5) public Integer characterId = null;
    @Tag(tag=7) public Integer levelId = null;
    @Tag(tag=13) public Integer avatarId = null;
}
