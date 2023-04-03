package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ForwardType.*;
import org.sorapointa.proto.ForwardType;
import org.sorapointa.proto.EvtAnimatorStateChangedInfo.*;
import org.sorapointa.proto.EvtAnimatorStateChangedInfo;

public class EvtAnimatorStateChangedNotify {
    public enum EvtAnimatorStateChangedNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=324) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=6) public Integer forwardType = null;
    @Tag(tag=8) public EvtAnimatorStateChangedInfo evtAnimatorStateChangedInfo = null;
}
