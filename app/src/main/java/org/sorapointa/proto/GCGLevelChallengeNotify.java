package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGLevelChallengeNotify {
    public enum HDFPCKFMMLI {
        @Tag(tag=0) None ,
        @Tag(tag=7016) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public List<GCGLevelData> levelList = new ArrayList<>();
    @Tag(tag=1) public List<Integer> unlockWorldChallengeList = new ArrayList<>();
    @Tag(tag=11) public List<GCGBossChallengeData> unlockBossChallengeList = new ArrayList<>();
}
