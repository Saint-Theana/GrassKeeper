package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerApplyEnterMpResultNotify {
    public enum PlayerApplyEnterMpResultNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1841) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7) public Boolean isAgreed = null;
    @Tag(tag=14) public String targetNickname = null;
    @Tag(tag=10) public Integer reason = null;
    @Tag(tag=1) public Integer targetUid = null;
}
