package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GmTalkRsp {
    public enum GmTalkRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=87) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=3) public String retmsg = null;
    @Tag(tag=7,isSigned=true) public Integer retcode = null;
    @Tag(tag=5) public String msg = null;
}
