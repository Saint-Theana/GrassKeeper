package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGWorldChallengeUnlockNotify {
    public enum LFDNFMMMGNM {
        @Tag(tag=0) None ,
        @Tag(tag=7273) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=6) public List<Integer> unlockIdList = new ArrayList<>();
}
