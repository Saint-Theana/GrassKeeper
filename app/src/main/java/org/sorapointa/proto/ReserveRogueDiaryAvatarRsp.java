package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ReserveRogueDiaryAvatarRsp {
    public enum ReserveRogueDiaryAvatarRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8800) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14,isSigned=true) public Integer retcode = null;
}
