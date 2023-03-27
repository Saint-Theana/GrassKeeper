package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGLevelChallengeFinishNotify {
    public enum JEGHNMNKFHL {
        @Tag(tag=0) None ,
        @Tag(tag=7360) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=1) public List<Integer> finishedChallengeIdList = new ArrayList<>();
    @Tag(tag=7) public Integer levelId = null;
}
