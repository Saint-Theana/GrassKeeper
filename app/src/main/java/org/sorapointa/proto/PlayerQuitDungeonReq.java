package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerQuitDungeonReq {
    public enum PlayerQuitDungeonReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=920) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=6) public Integer pointId = null;
    @Tag(tag=5) public Boolean isQuitImmediately = null;
}
