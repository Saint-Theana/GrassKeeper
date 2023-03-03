package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum ProtEntityType {
        @Tag(tag=0) PROT_ENTITY_TYPE_NONE ,
        @Tag(tag=1) PROT_ENTITY_TYPE_AVATAR ,
        @Tag(tag=2) PROT_ENTITY_TYPE_MONSTER ,
        @Tag(tag=3) PROT_ENTITY_TYPE_NPC ,
        @Tag(tag=4) PROT_ENTITY_TYPE_GADGET ,
        @Tag(tag=5) PROT_ENTITY_TYPE_REGION ,
        @Tag(tag=6) PROT_ENTITY_TYPE_WEAPON ,
        @Tag(tag=7) PROT_ENTITY_TYPE_WEATHER ,
        @Tag(tag=8) PROT_ENTITY_TYPE_SCENE ,
        @Tag(tag=9) PROT_ENTITY_TYPE_TEAM ,
        @Tag(tag=10) PROT_ENTITY_TYPE_MASSIVE_ENTITY ,
        @Tag(tag=11) PROT_ENTITY_TYPE_MP_LEVEL ,
        @Tag(tag=12) PROT_ENTITY_TYPE_PLAY_TEAM_ENTITY ,
        @Tag(tag=13) PROT_ENTITY_TYPE_EYE_POINT ,
        @Tag(tag=14) PROT_ENTITY_TYPE_MAX ;
}
