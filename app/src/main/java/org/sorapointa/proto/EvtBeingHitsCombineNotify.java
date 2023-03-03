package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.EvtBeingHitInfo.*;
import org.sorapointa.proto.EvtBeingHitInfo;
import org.sorapointa.proto.ForwardType.*;
import org.sorapointa.proto.ForwardType;

public class EvtBeingHitsCombineNotify {
    @Tag(tag=11) public Integer forwardType = null;
    @Tag(tag=7) public List<EvtBeingHitInfo> evtBeingHitInfoList = new ArrayList<>();
}
