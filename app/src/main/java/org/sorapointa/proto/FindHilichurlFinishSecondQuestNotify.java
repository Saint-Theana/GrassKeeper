package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FindHilichurlFinishSecondQuestNotify {
    public enum FindHilichurlFinishSecondQuestNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8774) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9) public Integer dayIndex = null;
}
