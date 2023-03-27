package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ServerCondMeetQuestListUpdateNotify {
    public enum ServerCondMeetQuestListUpdateNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=485) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2) public List<Integer> addQuestIdList = new ArrayList<>();
    @Tag(tag=7) public List<Integer> delQuestIdList = new ArrayList<>();
}
