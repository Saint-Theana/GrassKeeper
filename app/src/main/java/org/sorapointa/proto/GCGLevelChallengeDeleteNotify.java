package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGLevelChallengeDeleteNotify {
    public enum BDOLPLLDNIN {
        @Tag(tag=0) None ,
        @Tag(tag=7737) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14) public List<Integer> levelIdList = new ArrayList<>();
}
