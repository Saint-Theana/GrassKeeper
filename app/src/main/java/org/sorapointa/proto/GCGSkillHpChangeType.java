package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum GCGSkillHpChangeType {
        @Tag(tag=0) GCG_SKILL_HP_CHANGE_TYPE_NONE ,
        @Tag(tag=1) GCG_SKILL_HP_CHANGE_TYPE_DAMAGE ,
        @Tag(tag=2) GCG_SKILL_HP_CHANGE_TYPE_HEAL ;
}
