package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum ChangHpReason {
        @Tag(tag=0) ChangeHpNone ,
        @Tag(tag=1) ChangeHpSubAvatar ,
        @Tag(tag=2) ChangeHpSubMonster ,
        @Tag(tag=3) ChangeHpSubGear ,
        @Tag(tag=4) ChangeHpSubEnvir ,
        @Tag(tag=5) ChangeHpSubFall ,
        @Tag(tag=6) ChangeHpSubDrawn ,
        @Tag(tag=7) ChangeHpSubAbyss ,
        @Tag(tag=8) ChangeHpSubAbility ,
        @Tag(tag=9) ChangeHpSubSummon ,
        @Tag(tag=10) ChangeHpSubScript ,
        @Tag(tag=11) ChangeHpSubGm ,
        @Tag(tag=12) ChangeHpSubKillSelf ,
        @Tag(tag=13) ChangeHpSubClimateCold ,
        @Tag(tag=14) ChangeHpSubStormLightning ,
        @Tag(tag=15) ChangeHpSubKillServerGadget ,
        @Tag(tag=16) ChangeHpSubReplace ,
        @Tag(tag=17) ChangeHpSubPlayerLeave ,
        @Tag(tag=18) ChangeHpAttackByEnergy ,
        @Tag(tag=19) ChangeHpAttackByRecycle ,
        @Tag(tag=51) ChangeHpByLua ,
        @Tag(tag=101) ChangeHpAddAbility ,
        @Tag(tag=102) ChangeHpAddItem ,
        @Tag(tag=103) ChangeHpAddRevive ,
        @Tag(tag=104) ChangeHpAddUpgrade ,
        @Tag(tag=105) ChangeHpAddStatue ,
        @Tag(tag=106) ChangeHpAddBackground ,
        @Tag(tag=107) ChangeHpAddGm ,
        @Tag(tag=108) ChangeHpAddTrialAvatarActivity ,
        @Tag(tag=109) ChangeHpAddRouguelikeSpring ;
}
