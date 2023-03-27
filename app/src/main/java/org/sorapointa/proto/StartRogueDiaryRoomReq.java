package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class StartRogueDiaryRoomReq {
    public enum StartRogueDiaryRoomReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8792) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=4) public Boolean isSelectHard = null;
    @Tag(tag=1) public Integer roomDifficulty = null;
}
