package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.InstableSprayAvatarInfo.*;
import org.sorapointa.proto.InstableSprayAvatarInfo;

public class InstableSprayEnterDungeonReq {
    @Tag(tag=13) public Integer stageId = null;
    @Tag(tag=2) public Integer difficulty = null;
    @Tag(tag=7) public List<InstableSprayAvatarInfo> avatarInfoList = new ArrayList<>();
}
