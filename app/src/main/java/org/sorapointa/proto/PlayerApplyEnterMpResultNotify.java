package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerApplyEnterMpResultNotify {
    public enum Reason {
        @Tag(tag=0) REASON_PLAYER_JUDGE ,
        @Tag(tag=1) REASON_SCENE_CANNOT_ENTER ,
        @Tag(tag=2) REASON_PLAYER_CANNOT_ENTER_MP ,
        @Tag(tag=3) REASON_SYSTEM_JUDGE ,
        @Tag(tag=4) REASON_ALLOW_ENTER_PLAYER_FULL ,
        @Tag(tag=5) REASON_WORLD_LEVEL_LOWER_THAN_HOST ,
        @Tag(tag=6) REASON_HOST_IN_MATCH ,
        @Tag(tag=7) REASON_PLAYER_IN_BLACKLIST ,
        @Tag(tag=8) REASON_PS_PLAYER_NOT_ACCEPT_OTHERS ,
        @Tag(tag=9) REASON_HOST_IS_BLOCKED ,
        @Tag(tag=10) REASON_OTHER_DATA_VERSION_NOT_LATEST ,
        @Tag(tag=11) REASON_DATA_VERSION_NOT_LATEST ,
        @Tag(tag=12) REASON_PLAYER_NOT_IN_PLAYER_WORLD ,
        @Tag(tag=13) REASON_MAX_PLAYER ;
    }

    @Tag(tag=2) public Boolean isAgreed = null;
    @Tag(tag=12) public String targetNickname = null;
    @Tag(tag=13) public Reason reason = null;
    @Tag(tag=1) public Integer targetUid = null;
}
