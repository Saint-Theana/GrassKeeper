package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.EvtBeingHitInfo.*;
import org.sorapointa.proto.EvtBeingHitInfo;
import org.sorapointa.proto.ForwardType.*;
import org.sorapointa.proto.ForwardType;

public class EvtBeingHitNotify {
    @Tag(tag=6) public Integer forwardType = null;
    @Tag(tag=3) public EvtBeingHitInfo beingHitInfo = null;
}
