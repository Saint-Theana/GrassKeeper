package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SetPlayerHeadImageRsp {
    public enum SetPlayerHeadImageRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4039) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5,isSigned=true) public Integer retcode = null;
    @Tag(tag=2) public Integer avatarId = null;
    @Tag(tag=9) public ProfilePicture profilePicture = null;
}
