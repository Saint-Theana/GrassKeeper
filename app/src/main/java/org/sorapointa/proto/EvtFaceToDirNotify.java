package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ForwardType.*;
import org.sorapointa.proto.ForwardType;
import org.sorapointa.proto.EvtFaceToDirInfo.*;
import org.sorapointa.proto.EvtFaceToDirInfo;

public class EvtFaceToDirNotify {
    public enum EvtFaceToDirNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=370) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=14) public Integer forwardType = null;
    @Tag(tag=2) public EvtFaceToDirInfo evtFaceToDirInfo = null;
}
