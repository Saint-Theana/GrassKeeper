package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerLogoutReq {
    public enum Reason {
        @Tag(tag=0) REASON_DISCONNECT ,
        @Tag(tag=1) REASON_CLIENT_REQ ,
        @Tag(tag=2) REASON_TIMEOUT ,
        @Tag(tag=3) REASON_ADMIN_REQ ,
        @Tag(tag=4) REASON_SERVER_CLOSE ,
        @Tag(tag=5) REASON_GM_CLEAR ,
        @Tag(tag=6) REASON_PLAYER_TRANSFER ,
        @Tag(tag=7) REASON_CLIENT_CHECKSUM_INVALID ;
    }

    @Tag(tag=6) public Reason reason = null;
}
