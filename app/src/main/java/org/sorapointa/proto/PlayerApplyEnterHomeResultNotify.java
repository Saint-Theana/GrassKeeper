package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerApplyEnterHomeResultNotify {
    public enum Reason {
        @Tag(tag=0) REASON_PLAYER_JUDGE ,
        @Tag(tag=1) REASON_PLAYER_ENTER_OPTION_REFUSE ,
        @Tag(tag=2) REASON_PLAYER_ENTER_OPTION_DIRECT ,
        @Tag(tag=3) REASON_SYSTEM_JUDGE ,
        @Tag(tag=4) REASON_HOST_IN_MATCH ,
        @Tag(tag=5) REASON_PS_PLAYER_NOT_ACCEPT_OTHERS ,
        @Tag(tag=6) REASON_OPEN_STATE_NOT_OPEN ,
        @Tag(tag=7) REASON_HOST_IN_EDIT_MODE ,
        @Tag(tag=8) REASON_PRIOR_CHECK ;
    }

    @Tag(tag=7) public String targetNickname = null;
    @Tag(tag=5) public Reason reason = null;
    @Tag(tag=12) public Integer targetUid = null;
    @Tag(tag=9) public Boolean isAgreed = null;
}
