package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum SealBattleType {
        @Tag(tag=0) SealBattleKeepAlive ,
        @Tag(tag=1) SealBattleKillMonster ,
        @Tag(tag=2) SealBattleEnergyCharge ;
}
