package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerApplyEnterMpResultReq {
    public enum PlayerApplyEnterMpResultReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1819) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=4) public Integer applyUid = null;
    @Tag(tag=6) public Boolean isAgreed = null;
}
