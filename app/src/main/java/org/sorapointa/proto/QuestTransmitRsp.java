package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class QuestTransmitRsp {
    public enum QuestTransmitRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=450) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=8) public Integer pointId = null;
    @Tag(tag=7,isSigned=true) public Integer retcode = null;
    @Tag(tag=5) public Integer questId = null;
}
