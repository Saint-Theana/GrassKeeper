package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AddQuestContentProgressRsp {
    public enum AddQuestContentProgressRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=480) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public Integer contentType = null;
    @Tag(tag=8,isSigned=true) public Integer retcode = null;
}
