package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class UnlockAvatarTalentRsp {
    public enum UnlockAvatarTalentRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1055) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=1,isSigned=true) public Integer retcode = null;
    @Tag(tag=13) public Long avatarGuid = null;
    @Tag(tag=2) public Integer talentId = null;
}
