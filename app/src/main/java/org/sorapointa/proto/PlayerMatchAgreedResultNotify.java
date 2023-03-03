package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MatchType.*;
import org.sorapointa.proto.MatchType;

public class PlayerMatchAgreedResultNotify {
    public enum Reason {
        @Tag(tag=0) REASON_SUCC ,
        @Tag(tag=1) REASON_TARGET_SCENE_CANNOT_ENTER ,
        @Tag(tag=2) REASON_SELF_MP_UNAVAILABLE ,
        @Tag(tag=3) REASON_OTHER_DATA_VERSION_NOT_LATEST ,
        @Tag(tag=4) REASON_DATA_VERSION_NOT_LATEST ;
    }

    @Tag(tag=14) public Integer targetUid = null;
    @Tag(tag=3) public Integer matchType = null;
    @Tag(tag=8) public Reason reason = null;
}
