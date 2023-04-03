package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ForwardType.*;
import org.sorapointa.proto.ForwardType;
import org.sorapointa.proto.EntityRendererChangedInfo.*;
import org.sorapointa.proto.EntityRendererChangedInfo;

public class EvtEntityRenderersChangedNotify {
    public enum EvtEntityRenderersChangedNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=350) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=10) public Integer forwardType = null;
    @Tag(tag=4) public Integer entityId = null;
    @Tag(tag=8) public Boolean isServerCache = null;
    @Tag(tag=13) public EntityRendererChangedInfo rendererChangedInfo = null;
}
