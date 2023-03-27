package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum PlayerDieType {
        @Tag(tag=0) PlayerDieNone ,
        @Tag(tag=1) PlayerDieKillByMonster ,
        @Tag(tag=2) PlayerDieKillByGear ,
        @Tag(tag=3) PlayerDieFall ,
        @Tag(tag=4) PlayerDieDrawn ,
        @Tag(tag=5) PlayerDieAbyss ,
        @Tag(tag=6) PlayerDieGm ,
        @Tag(tag=7) PlayerDieClimateCold ,
        @Tag(tag=8) PlayerDieStormLighting ;
}
