package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum RogueDiaryAvatarDisableStatus {
        @Tag(tag=0) ROGUE_DIARY_AVATAR_DISABLE_STATUS_NONE ,
        @Tag(tag=1) ROGUE_DIARY_AVATAR_DISABLE_STATUS_DEATH ,
        @Tag(tag=2) ROGUE_DIARY_AVATAR_DISABLE_STATUS_TIRED ,
        @Tag(tag=3) ROGUE_DIARY_AVATAR_DISABLE_STATUS_DUPLICATED ;
}
