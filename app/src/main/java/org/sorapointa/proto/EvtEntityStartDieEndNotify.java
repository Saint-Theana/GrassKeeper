package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ForwardType.*;
import org.sorapointa.proto.ForwardType;

public class EvtEntityStartDieEndNotify {
    @Tag(tag=15) public Boolean immediately = null;
    @Tag(tag=12) public Integer dieStateFlag = null;
    @Tag(tag=8) public Integer entityId = null;
    @Tag(tag=11) public Integer forwardType = null;
}
