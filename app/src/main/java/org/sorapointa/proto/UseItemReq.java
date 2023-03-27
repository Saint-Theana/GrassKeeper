package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class UseItemReq {
    public enum UseItemReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=670) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=8) public Long guid = null;
    @Tag(tag=14) public Integer optionIdx = null;
    @Tag(tag=12) public Integer count = null;
    @Tag(tag=13) public Boolean isEnterMpDungeonTeam = null;
    @Tag(tag=6) public Long targetGuid = null;
}
