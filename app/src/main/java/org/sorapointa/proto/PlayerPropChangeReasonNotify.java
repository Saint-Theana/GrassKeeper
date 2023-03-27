package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerPropChangeReasonNotify {
    public enum PlayerPropChangeReasonNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1214) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=6) public Integer propType = null;
    @Tag(tag=12,isFloat=true) public Float oldValue = null;
    @Tag(tag=9,isFloat=true) public Float curValue = null;
    @Tag(tag=1) public Integer reason = null;
}
