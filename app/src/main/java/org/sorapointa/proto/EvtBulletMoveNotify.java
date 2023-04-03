package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ForwardType.*;
import org.sorapointa.proto.ForwardType;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class EvtBulletMoveNotify {
    public enum EvtBulletMoveNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=388) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=11) public Integer forwardType = null;
    @Tag(tag=13) public Vector curPos = null;
    @Tag(tag=1) public Integer entityId = null;
}
