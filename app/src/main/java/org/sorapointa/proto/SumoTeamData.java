package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SumoAvatarInfo.*;
import org.sorapointa.proto.SumoAvatarInfo;

public class SumoTeamData {
    @Tag(tag=10) public List<SumoAvatarInfo> avatarInfoList = new ArrayList<>();
    @Tag(tag=8) public List<Integer> skillIdList = new ArrayList<>();
}
