package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.InvestigationTarget.*;
import org.sorapointa.proto.InvestigationTarget;

public class PlayerInvestigationTargetNotify {
    public enum PlayerInvestigationTargetNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1930) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=12) public List<InvestigationTarget> investigationTargetList = new ArrayList<>();
}
