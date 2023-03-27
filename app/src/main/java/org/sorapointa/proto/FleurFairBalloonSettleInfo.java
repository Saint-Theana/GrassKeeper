package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FleurFairBalloonSettleInfo {
    @Tag(tag=13) public BalloonSettleInfo settleInfo = null;
    @Tag(tag=8) public Boolean isNewRecord = null;
}
