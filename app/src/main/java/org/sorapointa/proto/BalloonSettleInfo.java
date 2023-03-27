package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BalloonSettleInfo {
    @Tag(tag=3) public Integer shootCount = null;
    @Tag(tag=14) public Integer maxCombo = null;
    @Tag(tag=1) public Integer finalScore = null;
    @Tag(tag=11) public Integer uid = null;
    @Tag(tag=15) public OnlinePlayerInfo playerInfo = null;
}
