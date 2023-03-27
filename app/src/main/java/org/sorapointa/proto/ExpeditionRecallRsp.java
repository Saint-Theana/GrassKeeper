package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ExpeditionRecallRsp {
    public enum ExpeditionRecallRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2156) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=3) public Integer pathId = null;
    @Tag(tag=8,isSigned=true) public Integer retcode = null;
}
