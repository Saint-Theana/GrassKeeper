package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.InBattleMechanicusCardChallengeState.*;
import org.sorapointa.proto.InBattleMechanicusCardChallengeState;

public class InBattleMechanicusCardInfo {
    @Tag(tag=12) public Integer randEffectId = null;
    @Tag(tag=3) public Integer endRound = null;
    @Tag(tag=5) public Integer challengeState = null;
    @Tag(tag=1) public Integer costPoints = null;
    @Tag(tag=11) public Integer cardId = null;
    @Tag(tag=8) public Integer beginRound = null;
}
