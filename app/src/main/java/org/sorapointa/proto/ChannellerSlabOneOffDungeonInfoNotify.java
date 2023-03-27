package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChannellerSlabOneOffDungeonInfoNotify {
    public enum ChannellerSlabOneOffDungeonInfoNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8038) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9) public List<Integer> schemeBuffIdList = new ArrayList<>();
}
