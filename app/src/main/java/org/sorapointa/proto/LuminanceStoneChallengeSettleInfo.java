package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.LuminanceStoneChallengeGallerySettleInfo.*;
import org.sorapointa.proto.LuminanceStoneChallengeGallerySettleInfo;

public class LuminanceStoneChallengeSettleInfo {
    @Tag(tag=8) public Boolean isNewRecord = null;
    @Tag(tag=11) public LuminanceStoneChallengeGallerySettleInfo settleInfo = null;
}
