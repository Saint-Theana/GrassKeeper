package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CrystalLinkLevelInfo.*;
import org.sorapointa.proto.CrystalLinkLevelInfo;

public class CrystalLinkActivityDetailInfo {
    @Tag(tag=3) public List<CrystalLinkLevelInfo> levelInfoList = new ArrayList<>();
    @Tag(tag=7) public Integer difficultyId = null;
}
