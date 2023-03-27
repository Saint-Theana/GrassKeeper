package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SceneForceLockNotify {
    public enum SceneForceLockNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=251) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=6) public List<Integer> forceIdList = new ArrayList<>();
}
