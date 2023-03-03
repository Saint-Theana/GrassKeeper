package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.PotionAvatarInfo.*;
import org.sorapointa.proto.PotionAvatarInfo;

public class PotionEnterDungeonReq {
    @Tag(tag=15) public List<Integer> buffIdList = new ArrayList<>();
    @Tag(tag=5) public Integer levelId = null;
    @Tag(tag=14) public List<PotionAvatarInfo> avatarInfoList = new ArrayList<>();
    @Tag(tag=2) public Integer modeId = null;
    @Tag(tag=13) public Integer stageId = null;
}
