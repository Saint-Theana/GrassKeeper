package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class InBattleMechanicusCardInfo {
    @Tag(tag=3) public Integer beginRound = null;
    @Tag(tag=2) public Integer costPoints = null;
    @Tag(tag=9) public Integer endRound = null;
    @Tag(tag=15) public Integer cardId = null;
    @Tag(tag=8) public Integer randEffectId = null;
    @Tag(tag=5) public Integer challengeState = null;
}
