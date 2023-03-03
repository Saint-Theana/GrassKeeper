package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum SealBattleType {
        @Tag(tag=0) SEAL_BATTLE_TYPE_KEEP_ALIVE ,
        @Tag(tag=1) SEAL_BATTLE_TYPE_KILL_MONSTER ,
        @Tag(tag=2) SEAL_BATTLE_TYPE_ENERGY_CHARGE ;
}
