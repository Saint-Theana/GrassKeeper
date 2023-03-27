package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum PlayerApplyEnterMpResultNotify_Reason {
        @Tag(tag=0) PlayerJudge ,
        @Tag(tag=1) SceneCannotEnter ,
        @Tag(tag=2) PlayerCannotEnterMp ,
        @Tag(tag=3) SystemJudge ,
        @Tag(tag=4) AllowEnterPlayerFull ,
        @Tag(tag=5) WorldLevelLowerThanHost ,
        @Tag(tag=6) HostInMatch ,
        @Tag(tag=7) PlayerInBlacklist ,
        @Tag(tag=8) PsPlayerNotAcceptOthers ,
        @Tag(tag=9) HostIsBlocked ,
        @Tag(tag=10) OtherDataVersionNotLatest ,
        @Tag(tag=11) DataVersionNotLatest ,
        @Tag(tag=12) PlayerNotInPlayerWorld ,
        @Tag(tag=13) MaxPlayer ;
}
