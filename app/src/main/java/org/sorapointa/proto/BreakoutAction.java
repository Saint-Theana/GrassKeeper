package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.BreakoutActionType.*;
import org.sorapointa.proto.BreakoutActionType;
import org.sorapointa.proto.BreakoutVector2.*;
import org.sorapointa.proto.BreakoutVector2;

public class BreakoutAction {
    @Tag(tag=1) public Integer actionType = null;
    @Tag(tag=2) public Long clientGameTime = null;
    @Tag(tag=3) public Long serverGameTime = null;
    @Tag(tag=4) public Boolean isFailed = null;
    @Tag(tag=5) public Integer preIndex = null;
    @Tag(tag=6) public Integer newIndex = null;
    @Tag(tag=7) public BreakoutVector2 pos = null;
    @Tag(tag=8) public BreakoutVector2 moveDir = null;
    @Tag(tag=9,isSigned=true) public Integer speed = null;
    @Tag(tag=10) public Integer peerId = null;
    @Tag(tag=11) public Integer elementType = null;
    @Tag(tag=12) public Integer elementReactionBuff = null;
    @Tag(tag=13) public Integer speedIncreaseCount = null;
    @Tag(tag=14) public Boolean hasExtraBall = null;
    @Tag(tag=15) public BreakoutVector2 extraBallDir = null;
    @Tag(tag=16) public Integer extraBallIndex = null;
    @Tag(tag=17,isSigned=true) public Integer offset = null;
    @Tag(tag=18) public Long lccmdkibdpf = null;
}
