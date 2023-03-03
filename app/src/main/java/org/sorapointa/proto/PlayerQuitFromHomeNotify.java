package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerQuitFromHomeNotify {
    public enum QuitReason {
        @Tag(tag=0) QUIT_REASON_INVALID ,
        @Tag(tag=1) QUIT_REASON_KICK_BY_HOST ,
        @Tag(tag=2) QUIT_REASON_BACK_TO_MY_WORLD ,
        @Tag(tag=3) QUIT_REASON_HOME_BLOCKED ,
        @Tag(tag=4) QUIT_REASON_HOME_IN_EDIT_MODE ,
        @Tag(tag=5) QUIT_REASON_BY_MUIP ,
        @Tag(tag=6) QUIT_REASON_CUR_MODULE_CLOSED ;
    }

    @Tag(tag=6) public QuitReason reason = null;
}
