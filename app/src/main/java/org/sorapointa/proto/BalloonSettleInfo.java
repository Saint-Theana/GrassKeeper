package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.OnlinePlayerInfo.*;
import org.sorapointa.proto.OnlinePlayerInfo;

public class BalloonSettleInfo {
    @Tag(tag=3) public Integer uid = null;
    @Tag(tag=12) public Integer shootCount = null;
    @Tag(tag=9) public Integer maxCombo = null;
    @Tag(tag=7) public Integer finalScore = null;
    @Tag(tag=2) public OnlinePlayerInfo playerInfo = null;
}
