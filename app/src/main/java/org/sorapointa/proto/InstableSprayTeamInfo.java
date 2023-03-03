package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.InstableSprayAvatarInfo.*;
import org.sorapointa.proto.InstableSprayAvatarInfo;

public class InstableSprayTeamInfo {
    @Tag(tag=13) public List<InstableSprayAvatarInfo> avatarInfoList = new ArrayList<>();
}
