package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.VintageHuntingFirstStageInfo.*;
import org.sorapointa.proto.VintageHuntingFirstStageInfo;
import org.sorapointa.proto.VintageHuntingSecondStageInfo.*;
import org.sorapointa.proto.VintageHuntingSecondStageInfo;
import org.sorapointa.proto.VintageHuntingThirdStageInfo.*;
import org.sorapointa.proto.VintageHuntingThirdStageInfo;

public class SceneGalleryVintageHuntingInfo {
    @Tag(tag=7) public Integer stageId = null;
    @Tag(tag=2) public VintageHuntingFirstStageInfo firstStageInfo = null;
    @Tag(tag=15) public VintageHuntingSecondStageInfo secondStageInfo = null;
    @Tag(tag=12) public VintageHuntingThirdStageInfo thirdStageInfo = null;
}
