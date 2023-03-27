package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FinishedTalkIdListNotify {
    public enum LOPEKGOKHKB {
        @Tag(tag=0) None ,
        @Tag(tag=562) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10) public List<Integer> finishedTalkIdList = new ArrayList<>();
}
