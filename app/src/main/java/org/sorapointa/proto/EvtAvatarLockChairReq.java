package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class EvtAvatarLockChairReq {
    public enum EvtAvatarLockChairReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=337) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=3) public Long chairId = null;
    @Tag(tag=14) public Vector position = null;
}
