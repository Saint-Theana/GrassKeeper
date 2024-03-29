package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CompoundQueueData.*;
import org.sorapointa.proto.CompoundQueueData;

public class CompoundDataNotify {
    public enum CompoundDataNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=135) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14) public List<CompoundQueueData> compoundQueDataList = new ArrayList<>();
    @Tag(tag=5) public List<Integer> unlockCompoundList = new ArrayList<>();
}
