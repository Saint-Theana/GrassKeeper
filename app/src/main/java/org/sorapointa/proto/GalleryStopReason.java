package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum GalleryStopReason {
        @Tag(tag=0) GALLERY_STOP_REASON_NONE ,
        @Tag(tag=1) GALLERY_STOP_REASON_TIMEUP ,
        @Tag(tag=2) GALLERY_STOP_REASON_CLIENT_INTERRUPT ,
        @Tag(tag=3) GALLERY_STOP_REASON_LUA_INTERRUPT_SUCCESS ,
        @Tag(tag=4) GALLERY_STOP_REASON_LUA_INTERRUPT_FAIL ,
        @Tag(tag=5) GALLERY_STOP_REASON_OWNER_LEAVE_SCENE ,
        @Tag(tag=6) GALLERY_STOP_REASON_PLAY_INIT_FAILED ,
        @Tag(tag=7) GALLERY_STOP_REASON_OTHER_PLAYER_ENTER ,
        @Tag(tag=8) GALLERY_STOP_REASON_AVATAR_DIE ,
        @Tag(tag=9) GALLERY_STOP_REASON_FINISHED ,
        @Tag(tag=10) GALLERY_STOP_REASON_FUNGUS_ALL_DIE ;
}
