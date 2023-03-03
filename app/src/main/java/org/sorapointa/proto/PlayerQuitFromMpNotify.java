package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerQuitFromMpNotify {
    public enum QuitReason {
        @Tag(tag=0) QUIT_REASON_INVALID ,
        @Tag(tag=1) QUIT_REASON_HOST_NO_OTHER_PLAYER ,
        @Tag(tag=2) QUIT_REASON_KICK_BY_HOST ,
        @Tag(tag=3) QUIT_REASON_BACK_TO_MY_WORLD ,
        @Tag(tag=4) QUIT_REASON_KICK_BY_HOST_LOGOUT ,
        @Tag(tag=5) QUIT_REASON_KICK_BY_HOST_BLOCK ,
        @Tag(tag=6) QUIT_REASON_BE_BLOCKED ,
        @Tag(tag=7) QUIT_REASON_KICK_BY_HOST_ENTER_HOME ,
        @Tag(tag=8) QUIT_REASON_HOST_SCENE_INVALID ,
        @Tag(tag=9) QUIT_REASON_KICK_BY_PLAY ,
        @Tag(tag=10) QUIT_REASON_KICK_BY_ISLAND_PARTY_GALLERY_START_FAILED ;
    }

    @Tag(tag=11) public QuitReason reason = null;
}
