package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum PlayerQuitFromMpNotify_QuitReason {
        @Tag(tag=0) Invalid ,
        @Tag(tag=1) HostNoOtherPlayer ,
        @Tag(tag=2) KickByHost ,
        @Tag(tag=3) BackToMyWorld ,
        @Tag(tag=4) KickByHostLogout ,
        @Tag(tag=5) KickByHostBlock ,
        @Tag(tag=6) BeBlocked ,
        @Tag(tag=7) KickByHostEnterHome ,
        @Tag(tag=8) HostSceneInvalid ,
        @Tag(tag=9) KickByPlay ,
        @Tag(tag=10) KickByIslandPartyGalleryStartFailed ;
}
