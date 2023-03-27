package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarChangeCostumeRsp {
    public enum AvatarChangeCostumeRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1753) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15) public Integer costumeId = null;
    @Tag(tag=5) public Long avatarGuid = null;
    @Tag(tag=7,isSigned=true) public Integer retcode = null;
}
