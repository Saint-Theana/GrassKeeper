package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MpPlayOwnerCheckRsp {
    public enum MpPlayOwnerCheckRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1807) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13,isSigned=true) public Integer retcode = null;
    @Tag(tag=14) public Boolean isSkipMatch = null;
    @Tag(tag=15) public Integer wrongUid = null;
    @Tag(tag=4) public Integer mpPlayId = null;
}
