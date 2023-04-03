package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AvatarTeamResonanceInfo.*;
import org.sorapointa.proto.AvatarTeamResonanceInfo;

public class TeamResonanceChangeNotify {
    public enum TeamResonanceChangeNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1006) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=3) public List<AvatarTeamResonanceInfo> infoList = new ArrayList<>();
}
