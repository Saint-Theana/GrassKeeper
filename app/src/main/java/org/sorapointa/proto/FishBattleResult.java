package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum FishBattleResult {
        @Tag(tag=0) FISH_BATTLE_RESULT_NONE ,
        @Tag(tag=1) FISH_BATTLE_RESULT_SUCC ,
        @Tag(tag=2) FISH_BATTLE_RESULT_FAIL ,
        @Tag(tag=3) FISH_BATTLE_RESULT_TIMEOUT ,
        @Tag(tag=4) FISH_BATTLE_RESULT_CANCEL ,
        @Tag(tag=5) FISH_BATTLE_RESULT_EXIT ;
}
