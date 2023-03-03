package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.PotionStageData.*;
import org.sorapointa.proto.PotionStageData;

public class PotionResetChallengeRsp {
    @Tag(tag=11,isSigned=true) public Integer retcode = null;
    @Tag(tag=14) public PotionStageData stageData = null;
}
