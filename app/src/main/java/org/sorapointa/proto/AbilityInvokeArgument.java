package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum AbilityInvokeArgument {
        @Tag(tag=0) ABILITY_INVOKE_ARGUMENT_NONE ,
        @Tag(tag=1) ABILITY_INVOKE_ARGUMENT_META_MODIFIER_CHANGE ,
        @Tag(tag=2) ABILITY_INVOKE_ARGUMENT_META_COMMAND_MODIFIER_CHANGE_REQUEST ,
        @Tag(tag=3) ABILITY_INVOKE_ARGUMENT_META_SPECIAL_FLOAT_ARGUMENT ,
        @Tag(tag=4) ABILITY_INVOKE_ARGUMENT_META_OVERRIDE_PARAM ,
        @Tag(tag=5) ABILITY_INVOKE_ARGUMENT_META_CLEAR_OVERRIDE_PARAM ,
        @Tag(tag=6) ABILITY_INVOKE_ARGUMENT_META_REINIT_OVERRIDEMAP ,
        @Tag(tag=7) ABILITY_INVOKE_ARGUMENT_META_GLOBAL_FLOAT_VALUE ,
        @Tag(tag=8) ABILITY_INVOKE_ARGUMENT_META_CLEAR_GLOBAL_FLOAT_VALUE ,
        @Tag(tag=9) ABILITY_INVOKE_ARGUMENT_META_ABILITY_ELEMENT_STRENGTH ,
        @Tag(tag=10) ABILITY_INVOKE_ARGUMENT_META_ADD_OR_GET_ABILITY_AND_TRIGGER ,
        @Tag(tag=11) ABILITY_INVOKE_ARGUMENT_META_SET_KILLED_STATE ,
        @Tag(tag=12) ABILITY_INVOKE_ARGUMENT_META_SET_ABILITY_TRIGGER ,
        @Tag(tag=13) ABILITY_INVOKE_ARGUMENT_META_ADD_NEW_ABILITY ,
        @Tag(tag=14) ABILITY_INVOKE_ARGUMENT_META_REMOVE_ABILITY ,
        @Tag(tag=15) ABILITY_INVOKE_ARGUMENT_META_SET_MODIFIER_APPLY_ENTITY ,
        @Tag(tag=16) ABILITY_INVOKE_ARGUMENT_META_MODIFIER_DURABILITY_CHANGE ,
        @Tag(tag=17) ABILITY_INVOKE_ARGUMENT_META_ELEMENT_REACTION_VISUAL ,
        @Tag(tag=18) ABILITY_INVOKE_ARGUMENT_META_SET_POSE_PARAMETER ,
        @Tag(tag=19) ABILITY_INVOKE_ARGUMENT_META_UPDATE_BASE_REACTION_DAMAGE ,
        @Tag(tag=20) ABILITY_INVOKE_ARGUMENT_META_TRIGGER_ELEMENT_REACTION ,
        @Tag(tag=21) ABILITY_INVOKE_ARGUMENT_META_LOSE_HP ,
        @Tag(tag=22) ABILITY_INVOKE_ARGUMENT_META_DURABILITY_IS_ZERO ,
        @Tag(tag=50) ABILITY_INVOKE_ARGUMENT_ACTION_TRIGGER_ABILITY ,
        @Tag(tag=51) ABILITY_INVOKE_ARGUMENT_ACTION_SET_CRASH_DAMAGE ,
        @Tag(tag=52) ABILITY_INVOKE_ARGUMENT_ACTION_EFFECT ,
        @Tag(tag=53) ABILITY_INVOKE_ARGUMENT_ACTION_SUMMON ,
        @Tag(tag=54) ABILITY_INVOKE_ARGUMENT_ACTION_BLINK ,
        @Tag(tag=55) ABILITY_INVOKE_ARGUMENT_ACTION_CREATE_GADGET ,
        @Tag(tag=56) ABILITY_INVOKE_ARGUMENT_ACTION_APPLY_LEVEL_MODIFIER ,
        @Tag(tag=57) ABILITY_INVOKE_ARGUMENT_ACTION_GENERATE_ELEM_BALL ,
        @Tag(tag=58) ABILITY_INVOKE_ARGUMENT_ACTION_SET_RANDOM_OVERRIDE_MAP_VALUE ,
        @Tag(tag=59) ABILITY_INVOKE_ARGUMENT_ACTION_SERVER_MONSTER_LOG ,
        @Tag(tag=60) ABILITY_INVOKE_ARGUMENT_ACTION_CREATE_TILE ,
        @Tag(tag=61) ABILITY_INVOKE_ARGUMENT_ACTION_DESTROY_TILE ,
        @Tag(tag=62) ABILITY_INVOKE_ARGUMENT_ACTION_FIRE_AFTER_IMAGE ,
        @Tag(tag=63) ABILITY_INVOKE_ARGUMENT_ACTION_DEDUCT_STAMINA ,
        @Tag(tag=64) ABILITY_INVOKE_ARGUMENT_ACTION_HIT_EFFECT ,
        @Tag(tag=65) ABILITY_INVOKE_ARGUMENT_ACTION_SET_BULLET_TRACK_TARGET ,
        @Tag(tag=100) ABILITY_INVOKE_ARGUMENT_MIXIN_AVATAR_STEER_BY_CAMERA ,
        @Tag(tag=101) ABILITY_INVOKE_ARGUMENT_MIXIN_MONSTER_DEFEND ,
        @Tag(tag=102) ABILITY_INVOKE_ARGUMENT_MIXIN_WIND_ZONE ,
        @Tag(tag=103) ABILITY_INVOKE_ARGUMENT_MIXIN_COST_STAMINA ,
        @Tag(tag=104) ABILITY_INVOKE_ARGUMENT_MIXIN_ELITE_SHIELD ,
        @Tag(tag=105) ABILITY_INVOKE_ARGUMENT_MIXIN_ELEMENT_SHIELD ,
        @Tag(tag=106) ABILITY_INVOKE_ARGUMENT_MIXIN_GLOBAL_SHIELD ,
        @Tag(tag=107) ABILITY_INVOKE_ARGUMENT_MIXIN_SHIELD_BAR ,
        @Tag(tag=108) ABILITY_INVOKE_ARGUMENT_MIXIN_WIND_SEED_SPAWNER ,
        @Tag(tag=109) ABILITY_INVOKE_ARGUMENT_MIXIN_DO_ACTION_BY_ELEMENT_REACTION ,
        @Tag(tag=110) ABILITY_INVOKE_ARGUMENT_MIXIN_FIELD_ENTITY_COUNT_CHANGE ,
        @Tag(tag=111) ABILITY_INVOKE_ARGUMENT_MIXIN_SCENE_PROP_SYNC ,
        @Tag(tag=112) ABILITY_INVOKE_ARGUMENT_MIXIN_WIDGET_MP_SUPPORT ,
        @Tag(tag=113) ABILITY_INVOKE_ARGUMENT_MIXIN_DO_ACTION_BY_SELF_MODIFIER_ELEMENT_DURABILITY_RATIO ,
        @Tag(tag=114) ABILITY_INVOKE_ARGUMENT_MIXIN_FIREWORKS_LAUNCHER ,
        @Tag(tag=115) ABILITY_INVOKE_ARGUMENT_MIXIN_ATTACK_RESULT_CREATE_COUNT ,
        @Tag(tag=116) ABILITY_INVOKE_ARGUMENT_MIXIN_UGC_TIME_CONTROL ,
        @Tag(tag=117) ABILITY_INVOKE_ARGUMENT_MIXIN_AVATAR_COMBAT ,
        @Tag(tag=118) ABILITY_INVOKE_ARGUMENT_MIXIN_DEATH_ZONE_REGIONAL_PLAY_MIXIN ,
        @Tag(tag=119) ABILITY_INVOKE_ARGUMENT_MIXIN_UI_INTERACT ,
        @Tag(tag=120) ABILITY_INVOKE_ARGUMENT_MIXIN_SHOOT_FROM_CAMERA ,
        @Tag(tag=121) ABILITY_INVOKE_ARGUMENT_MIXIN_ERASE_BRICK_ACTIVITY ;
}
