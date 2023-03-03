package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.WinterCampStageInfo.*;
import org.sorapointa.proto.WinterCampStageInfo;

public class WinterCampStageInfoChangeNotify {
    @Tag(tag=12) public WinterCampStageInfo exploreInfo = null;
    @Tag(tag=4) public WinterCampStageInfo battleInfo = null;
}
