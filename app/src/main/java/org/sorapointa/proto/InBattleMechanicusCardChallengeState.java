package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum InBattleMechanicusCardChallengeState {
        @Tag(tag=0) InBattleMechanicusCardChallengeNone ,
        @Tag(tag=1) InBattleMechanicusCardChallengeOnGoing ,
        @Tag(tag=2) InBattleMechanicusCardChallengeFail ,
        @Tag(tag=3) InBattleMechanicusCardChallengeSuccess ;
}
