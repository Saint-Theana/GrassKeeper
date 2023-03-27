package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HuntingFailNotify {
    public enum HuntingFailNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4302) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9) public HuntingPair huntingPair = null;
}
