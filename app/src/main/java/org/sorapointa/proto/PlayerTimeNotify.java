package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerTimeNotify {
    public enum PlayerTimeNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=103) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public Long playerTime = null;
    @Tag(tag=15) public Long serverTime = null;
    @Tag(tag=7) public Boolean isPaused = null;
}
