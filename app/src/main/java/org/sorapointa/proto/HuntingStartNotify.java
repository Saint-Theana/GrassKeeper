package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HuntingStartNotify {
    public enum HuntingStartNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4331) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public Integer failTime = null;
    @Tag(tag=12) public HuntingPair huntingPair = null;
    @Tag(tag=7) public Boolean isFinal = null;
    @Tag(tag=14) public Vector cluePosition = null;
}
