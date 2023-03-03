package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.LuminanceStoneChallengeSettleInfo.*;
import org.sorapointa.proto.LuminanceStoneChallengeSettleInfo;

public class LuminanceStoneChallengeSettleNotify {
    @Tag(tag=10) public Integer galleryId = null;
    @Tag(tag=13) public LuminanceStoneChallengeSettleInfo settleInfo = null;
}
