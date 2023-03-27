package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetQuestTalkHistoryRsp {
    public enum GetQuestTalkHistoryRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=462) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=8,isSigned=true) public Integer retcode = null;
    @Tag(tag=13) public Integer parentQuestId = null;
    @Tag(tag=7) public List<Integer> talkIdList = new ArrayList<>();
}
