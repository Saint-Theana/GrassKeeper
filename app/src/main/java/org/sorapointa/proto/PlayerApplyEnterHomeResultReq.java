package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerApplyEnterHomeResultReq {
    public enum PlayerApplyEnterHomeResultReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4549) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=5) public Integer applyUid = null;
    @Tag(tag=4) public Boolean isAgreed = null;
}
