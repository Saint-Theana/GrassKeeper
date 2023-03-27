package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TeamChainChooseTeamInfo {
    @Tag(tag=12) public List<Integer> skillNoList = new ArrayList<>();
    @Tag(tag=6) public List<TeamChainChooseAvatarInfo> avatarInfoList = new ArrayList<>();
}
