package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TrialAvatarGrantRecord {
    public enum GrantReason {
        @Tag(tag=0) GRANT_REASON_INVALID ,
        @Tag(tag=1) GRANT_REASON_BY_QUEST ,
        @Tag(tag=2) GRANT_REASON_BY_TRIAL_AVATAR_ACTIVITY ,
        @Tag(tag=3) GRANT_REASON_BY_DUNGEON_ELEMENT_CHALLENGE ,
        @Tag(tag=4) GRANT_REASON_BY_MIST_TRIAL_ACTIVITY ,
        @Tag(tag=5) GRANT_REASON_BY_SUMO_ACTIVITY ,
        @Tag(tag=6) GRANT_REASON_BY_POTION_ACTIVITY ,
        @Tag(tag=7) GRANT_REASON_BY_CRYSTAL_LINK_ACTIVITY ,
        @Tag(tag=8) GRANT_REASON_BY_IRODORI_MASTER ,
        @Tag(tag=9) GRANT_REASON_BY_GM ,
        @Tag(tag=10) GRANT_REASON_BY_INSTABLE_SPRAY_ACTIVITY ,
        @Tag(tag=11) GRANT_REASON_BY_MUQADAS_POTION_ACTIVITY ,
        @Tag(tag=12) GRANT_REASON_BY_VINTAGE_HUNTING ,
        @Tag(tag=13) GRANT_REASON_BY_CHAR_AMUSEMENT ;
    }

    @Tag(tag=1) public Integer grantReason = null;
    @Tag(tag=2) public Integer fromParentQuestId = null;
}
