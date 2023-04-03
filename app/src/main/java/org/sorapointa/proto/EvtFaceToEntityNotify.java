package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ForwardType.*;
import org.sorapointa.proto.ForwardType;

public class EvtFaceToEntityNotify {
    public enum EvtFaceToEntityNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=380) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=8) public Integer entityId = null;
    @Tag(tag=4) public Integer faceEntityId = null;
    @Tag(tag=10) public Integer forwardType = null;
}
