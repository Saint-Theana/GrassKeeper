package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.BalloonSettleInfo.*;
import org.sorapointa.proto.BalloonSettleInfo;

public class FleurFairBalloonSettleInfo {
    @Tag(tag=10) public BalloonSettleInfo settleInfo = null;
    @Tag(tag=7) public Boolean isNewRecord = null;
}
