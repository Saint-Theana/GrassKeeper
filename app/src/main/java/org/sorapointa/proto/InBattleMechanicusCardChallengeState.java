package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum InBattleMechanicusCardChallengeState {
        @Tag(tag=0) IN_BATTLE_MECHANICUS_CARD_CHALLENGE_STATE_NONE ,
        @Tag(tag=1) IN_BATTLE_MECHANICUS_CARD_CHALLENGE_STATE_ON_GOING ,
        @Tag(tag=2) IN_BATTLE_MECHANICUS_CARD_CHALLENGE_STATE_FAIL ,
        @Tag(tag=3) IN_BATTLE_MECHANICUS_CARD_CHALLENGE_STATE_SUCCESS ;
}
