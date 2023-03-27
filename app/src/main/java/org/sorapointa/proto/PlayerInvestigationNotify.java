package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerInvestigationNotify {
    public enum PlayerInvestigationNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1911) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=12) public List<Investigation> investigationList = new ArrayList<>();
}
