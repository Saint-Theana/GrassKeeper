package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class UnlockTransPointReq {
    public enum UnlockTransPointReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3354) CmdId ,
        @Tag(tag=1) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=4) public Integer pointId = null;
    @Tag(tag=6) public Integer sceneId = null;
}
