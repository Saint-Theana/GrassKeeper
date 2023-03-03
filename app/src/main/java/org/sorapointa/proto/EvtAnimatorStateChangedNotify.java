package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.EvtAnimatorStateChangedInfo.*;
import org.sorapointa.proto.EvtAnimatorStateChangedInfo;
import org.sorapointa.proto.ForwardType.*;
import org.sorapointa.proto.ForwardType;

public class EvtAnimatorStateChangedNotify {
    @Tag(tag=3) public Integer forwardType = null;
    @Tag(tag=10) public EvtAnimatorStateChangedInfo evtAnimatorStateChangedInfo = null;
}
