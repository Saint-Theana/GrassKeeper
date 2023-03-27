package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum GalleryStopReason {
        @Tag(tag=0) GalleryStopNone ,
        @Tag(tag=1) GalleryStopTimeup ,
        @Tag(tag=2) GalleryStopClientInterrupt ,
        @Tag(tag=3) GalleryStopLuaInterruptSuccess ,
        @Tag(tag=4) GalleryStopLuaInterruptFail ,
        @Tag(tag=5) GalleryStopOwnerLeaveScene ,
        @Tag(tag=6) GalleryStopPlayInitFailed ,
        @Tag(tag=7) GalleryStopOtherPlayerEnter ,
        @Tag(tag=8) GalleryStopAvatarDie ,
        @Tag(tag=9) GalleryStopFinished ,
        @Tag(tag=10) GalleryStopFungusAllDie ,
        @Tag(tag=11) GalleryStopLifeCountZero ,
        @Tag(tag=12) LIFIACKICDO ;
}
