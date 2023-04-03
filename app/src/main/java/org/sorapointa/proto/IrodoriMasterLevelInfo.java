package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.IrodoriMasterLevelDetailInfo.*;
import org.sorapointa.proto.IrodoriMasterLevelDetailInfo;

public class IrodoriMasterLevelInfo {
    @Tag(tag=1) public Integer levelId = null;
    @Tag(tag=14) public List<IrodoriMasterLevelDetailInfo> detailInfo = new ArrayList<>();
}
