package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum ChangeHpReason {
        @Tag(tag=0) CHANGE_HP_REASON_NONE ,
        @Tag(tag=1) CHANGE_HP_REASON_SUB_AVATAR ,
        @Tag(tag=2) CHANGE_HP_REASON_SUB_MONSTER ,
        @Tag(tag=3) CHANGE_HP_REASON_SUB_GEAR ,
        @Tag(tag=4) CHANGE_HP_REASON_SUB_ENVIR ,
        @Tag(tag=5) CHANGE_HP_REASON_SUB_FALL ,
        @Tag(tag=6) CHANGE_HP_REASON_SUB_DRAWN ,
        @Tag(tag=7) CHANGE_HP_REASON_SUB_ABYSS ,
        @Tag(tag=8) CHANGE_HP_REASON_SUB_ABILITY ,
        @Tag(tag=9) CHANGE_HP_REASON_SUB_SUMMON ,
        @Tag(tag=10) CHANGE_HP_REASON_SUB_SCRIPT ,
        @Tag(tag=11) CHANGE_HP_REASON_SUB_GM ,
        @Tag(tag=12) CHANGE_HP_REASON_SUB_KILL_SELF ,
        @Tag(tag=13) CHANGE_HP_REASON_SUB_CLIMATE_COLD ,
        @Tag(tag=14) CHANGE_HP_REASON_SUB_STORM_LIGHTNING ,
        @Tag(tag=15) CHANGE_HP_REASON_SUB_KILL_SERVER_GADGET ,
        @Tag(tag=16) CHANGE_HP_REASON_SUB_REPLACE ,
        @Tag(tag=17) CHANGE_HP_REASON_SUB_PLAYER_LEAVE ,
        @Tag(tag=18) CHANGE_HP_REASON_ATTACK_BY_ENERGY ,
        @Tag(tag=19) CHANGE_HP_REASON_ATTACK_BY_RECYCLE ,
        @Tag(tag=51) CHANGE_HP_REASON_BY_LUA ,
        @Tag(tag=101) CHANGE_HP_REASON_ADD_ABILITY ,
        @Tag(tag=102) CHANGE_HP_REASON_ADD_ITEM ,
        @Tag(tag=103) CHANGE_HP_REASON_ADD_REVIVE ,
        @Tag(tag=104) CHANGE_HP_REASON_ADD_UPGRADE ,
        @Tag(tag=105) CHANGE_HP_REASON_ADD_STATUE ,
        @Tag(tag=106) CHANGE_HP_REASON_ADD_BACKGROUND ,
        @Tag(tag=107) CHANGE_HP_REASON_ADD_GM ,
        @Tag(tag=108) CHANGE_HP_REASON_ADD_TRIAL_AVATAR_ACTIVITY ,
        @Tag(tag=109) CHANGE_HP_REASON_ADD_ROGUELIKE_SPRING ;
}
