package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum GadgetBornType {
        @Tag(tag=0) GADGET_BORN_TYPE_NONE ,
        @Tag(tag=1) GADGET_BORN_TYPE_IN_AIR ,
        @Tag(tag=2) GADGET_BORN_TYPE_PLAYER ,
        @Tag(tag=3) GADGET_BORN_TYPE_MONSTER_HIT ,
        @Tag(tag=4) GADGET_BORN_TYPE_MONSTER_DIE ,
        @Tag(tag=5) GADGET_BORN_TYPE_GADGET ,
        @Tag(tag=6) GADGET_BORN_TYPE_GROUND ;
}
