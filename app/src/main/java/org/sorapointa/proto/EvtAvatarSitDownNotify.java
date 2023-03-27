package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EvtAvatarSitDownNotify {
    public enum EvtAvatarSitDownNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=353) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=2) public Vector position = null;
    @Tag(tag=4) public Integer entityId = null;
    @Tag(tag=11) public Long chairId = null;
}
