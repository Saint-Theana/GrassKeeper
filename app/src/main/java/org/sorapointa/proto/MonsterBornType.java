package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum MonsterBornType {
        @Tag(tag=0) MONSTER_BORN_TYPE_NONE ,
        @Tag(tag=1) MONSTER_BORN_TYPE_DEFAULT ,
        @Tag(tag=2) MONSTER_BORN_TYPE_RANDOM ;
}
