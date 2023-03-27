package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum MonsterBornType {
        @Tag(tag=0) MonsterBornNone ,
        @Tag(tag=1) MonsterBornDefault ,
        @Tag(tag=2) MonsterBornRandom ;
}
