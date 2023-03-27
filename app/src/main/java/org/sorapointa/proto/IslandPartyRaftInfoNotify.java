package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class IslandPartyRaftInfoNotify {
    public enum IslandPartyRaftInfoNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5588) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9) public Integer fuel = null;
    @Tag(tag=12) public Integer component = null;
    @Tag(tag=6) public Integer pointId = null;
    @Tag(tag=5) public Integer coin = null;
}
