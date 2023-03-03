package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum BattlePassUnlockStatus {
        @Tag(tag=0) BATTLE_PASS_UNLOCK_STATUS_INVALID ,
        @Tag(tag=1) BATTLE_PASS_UNLOCK_STATUS_FREE ,
        @Tag(tag=2) BATTLE_PASS_UNLOCK_STATUS_PAID ;
}
