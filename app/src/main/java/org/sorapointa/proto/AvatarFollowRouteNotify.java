package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarFollowRouteNotify {
    public enum AvatarFollowRouteNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3097) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=6) public Integer startSceneTimeMs = null;
    @Tag(tag=2) public Integer templateId = null;
    @Tag(tag=10) public String clientParams = null;
    @Tag(tag=4) public Route route = null;
    @Tag(tag=1) public Integer entityId = null;
}
