package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FishAttractNotify {
    public enum FishAttractNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5815) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=3) public Vector pos = null;
    @Tag(tag=5) public List<Integer> fishIdList = new ArrayList<>();
    @Tag(tag=10) public Integer uid = null;
}
