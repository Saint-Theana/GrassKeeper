package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class OpenBlossomCircleCampGuideNotify {
    public enum OpenBlossomCircleCampGuideNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2780) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=13) public List<Integer> circleCampIdList = new ArrayList<>();
    @Tag(tag=5) public Integer refreshId = null;
}
