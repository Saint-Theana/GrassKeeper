package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerInvestigationAllInfoNotify {
    public enum PlayerInvestigationAllInfoNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1917) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=6) public List<InvestigationTarget> investigationTargetList = new ArrayList<>();
    @Tag(tag=2) public List<Investigation> investigationList = new ArrayList<>();
}
