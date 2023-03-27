package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ScenePlayOwnerCheckReq {
    public enum ScenePlayOwnerCheckReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4405) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=13) public Integer playId = null;
    @Tag(tag=8) public Boolean isSkipMatch = null;
}
