package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum BattlePassUnlockStatus {
        @Tag(tag=0) BattlePassUnlockInvalid ,
        @Tag(tag=1) BattlePassUnlockFree ,
        @Tag(tag=2) BattlePassUnlockPaid ;
}
