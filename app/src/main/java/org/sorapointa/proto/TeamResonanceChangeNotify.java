package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AvatarTeamResonanceInfo.*;
import org.sorapointa.proto.AvatarTeamResonanceInfo;

public class TeamResonanceChangeNotify {
    @Tag(tag=1) public List<AvatarTeamResonanceInfo> infoList = new ArrayList<>();
}
