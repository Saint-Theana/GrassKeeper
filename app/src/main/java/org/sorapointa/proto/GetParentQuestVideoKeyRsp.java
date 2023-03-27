package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetParentQuestVideoKeyRsp {
    public enum GetParentQuestVideoKeyRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=427) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2) public Long videoKey = null;
    @Tag(tag=9,isSigned=true) public Integer retcode = null;
    @Tag(tag=11) public Integer parentQuestId = null;
}
