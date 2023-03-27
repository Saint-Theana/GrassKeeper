package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SetPlayerNameRsp {
    public enum SetPlayerNameRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=192) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=11,isSigned=true) public Integer retcode = null;
    @Tag(tag=13) public String nickName = null;
}
