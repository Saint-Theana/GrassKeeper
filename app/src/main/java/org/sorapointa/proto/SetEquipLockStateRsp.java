package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SetEquipLockStateRsp {
    public enum SetEquipLockStateRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=611) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=8,isSigned=true) public Integer retcode = null;
    @Tag(tag=4) public Boolean isLocked = null;
    @Tag(tag=11) public Long targetEquipGuid = null;
}
