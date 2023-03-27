package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarPromoteRsp {
    public enum AvatarPromoteRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1668) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public Long guid = null;
    @Tag(tag=7,isSigned=true) public Integer retcode = null;
}
