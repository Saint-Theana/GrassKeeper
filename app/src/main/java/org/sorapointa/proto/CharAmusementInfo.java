package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CharAmusementAvatarInfo.*;
import org.sorapointa.proto.CharAmusementAvatarInfo;

public class CharAmusementInfo {
    @Tag(tag=11) public Integer totalCostTime = null;
    @Tag(tag=2) public Integer stageId = null;
    @Tag(tag=10) public Integer levelId = null;
    @Tag(tag=4) public Integer previewStageIndex = null;
    @Tag(tag=5) public List<CharAmusementAvatarInfo> avatarInfoList = new ArrayList<>();
}
