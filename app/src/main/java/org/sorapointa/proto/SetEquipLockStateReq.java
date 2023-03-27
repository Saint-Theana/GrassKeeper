package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SetEquipLockStateReq {
    public enum SetEquipLockStateReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=684) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=10) public Long targetEquipGuid = null;
    @Tag(tag=3) public Boolean isLocked = null;
}
