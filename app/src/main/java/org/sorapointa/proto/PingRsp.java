package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PingRsp {
    public enum PingRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=74) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public Integer seq = null;
    @Tag(tag=11,isSigned=true) public Integer retcode = null;
    @Tag(tag=1) public Integer clientTime = null;
}
