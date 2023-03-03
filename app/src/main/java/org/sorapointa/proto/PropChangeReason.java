package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum PropChangeReason {
        @Tag(tag=0) PROP_CHANGE_REASON_NONE ,
        @Tag(tag=1) PROP_CHANGE_REASON_STATUE_RECOVER ,
        @Tag(tag=2) PROP_CHANGE_REASON_ENERGY_BALL ,
        @Tag(tag=3) PROP_CHANGE_REASON_ABILITY ,
        @Tag(tag=4) PROP_CHANGE_REASON_LEVELUP ,
        @Tag(tag=5) PROP_CHANGE_REASON_ITEM ,
        @Tag(tag=6) PROP_CHANGE_REASON_AVATAR_CARD ,
        @Tag(tag=7) PROP_CHANGE_REASON_CITY_LEVELUP ,
        @Tag(tag=8) PROP_CHANGE_REASON_AVATAR_UPGRADE ,
        @Tag(tag=9) PROP_CHANGE_REASON_AVATAR_PROMOTE ,
        @Tag(tag=10) PROP_CHANGE_REASON_PLAYER_ADD_EXP ,
        @Tag(tag=11) PROP_CHANGE_REASON_FINISH_QUEST ,
        @Tag(tag=12) PROP_CHANGE_REASON_GM ,
        @Tag(tag=13) PROP_CHANGE_REASON_MANUAL_ADJUST_WORLD_LEVEL ;
}
