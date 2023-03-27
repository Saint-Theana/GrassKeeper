package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class InstableSprayTeamInfo {
    @Tag(tag=12) public List<InstableSprayAvatarInfo> avatarInfoList = new ArrayList<>();
}
