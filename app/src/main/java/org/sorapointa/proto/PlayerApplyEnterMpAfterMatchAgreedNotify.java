package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MatchType.*;
import org.sorapointa.proto.MatchType;
import org.sorapointa.proto.OnlinePlayerInfo.*;
import org.sorapointa.proto.OnlinePlayerInfo;

public class PlayerApplyEnterMpAfterMatchAgreedNotify {
    @Tag(tag=11) public OnlinePlayerInfo srcPlayerInfo = null;
    @Tag(tag=10) public Integer matchserverId = null;
    @Tag(tag=3) public Integer matchType = null;
}
