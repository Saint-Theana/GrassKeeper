package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarPropChangeReasonNotify {
    public enum AvatarPropChangeReasonNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1262) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2,isFloat=true) public Float curValue = null;
    @Tag(tag=10) public Integer propType = null;
    @Tag(tag=4,isFloat=true) public Float oldValue = null;
    @Tag(tag=5) public Integer reason = null;
    @Tag(tag=12) public Long avatarGuid = null;
}
