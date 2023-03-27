package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerApplyEnterHomeResultNotify {
    public enum PlayerApplyEnterHomeResultNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4642) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2) public Integer targetUid = null;
    @Tag(tag=3) public Integer reason = null;
    @Tag(tag=10) public Boolean isAgreed = null;
    @Tag(tag=9) public String targetNickname = null;
}
