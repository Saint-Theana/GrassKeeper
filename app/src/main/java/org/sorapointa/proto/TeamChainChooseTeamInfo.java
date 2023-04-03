package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.TeamChainChooseAvatarInfo.*;
import org.sorapointa.proto.TeamChainChooseAvatarInfo;

public class TeamChainChooseTeamInfo {
    @Tag(tag=12) public List<Integer> skillNoList = new ArrayList<>();
    @Tag(tag=6) public List<TeamChainChooseAvatarInfo> avatarInfoList = new ArrayList<>();
}
