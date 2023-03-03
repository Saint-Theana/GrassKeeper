package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SealBattleType.*;
import org.sorapointa.proto.SealBattleType;

public class SealBattleBeginNotify {
    @Tag(tag=9) public Integer sealMaxProgress = null;
    @Tag(tag=1) public Integer sealEntityId = null;
    @Tag(tag=12) public Integer sealRadius = null;
    @Tag(tag=14) public Integer battleType = null;
}
