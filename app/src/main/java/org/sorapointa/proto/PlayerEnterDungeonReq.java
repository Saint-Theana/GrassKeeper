package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerEnterDungeonReq {
    public enum PlayerEnterDungeonReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=987) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=2) public Integer dungeonId = null;
    @Tag(tag=9) public Integer pointId = null;
    @Tag(tag=4) public DungeonEnterPosInfo enterPosInfo = null;
}
