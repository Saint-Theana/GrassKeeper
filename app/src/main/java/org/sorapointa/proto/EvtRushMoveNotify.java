package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.EvtRushMoveInfo.*;
import org.sorapointa.proto.EvtRushMoveInfo;
import org.sorapointa.proto.ForwardType.*;
import org.sorapointa.proto.ForwardType;

public class EvtRushMoveNotify {
    @Tag(tag=1) public Integer forwardType = null;
    @Tag(tag=15) public EvtRushMoveInfo evtRushMoveInfo = null;
}
