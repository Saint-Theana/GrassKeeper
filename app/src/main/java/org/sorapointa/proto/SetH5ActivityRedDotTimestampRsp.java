package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SetH5ActivityRedDotTimestampRsp {
    public enum SetH5ActivityRedDotTimestampRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5669) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4,isSigned=true) public Integer retcode = null;
}
