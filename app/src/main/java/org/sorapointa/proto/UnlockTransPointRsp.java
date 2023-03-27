package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class UnlockTransPointRsp {
    public enum UnlockTransPointRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3057) CmdId ,
        @Tag(tag=1) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=3,isSigned=true) public Integer retcode = null;
}
