package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum ProtEntityType {
        @Tag(tag=0) ProtEntityNone ,
        @Tag(tag=1) ProtEntityAvatar ,
        @Tag(tag=2) ProtEntityMonster ,
        @Tag(tag=3) ProtEntityNpc ,
        @Tag(tag=4) ProtEntityGadget ,
        @Tag(tag=5) ProtEntityRegion ,
        @Tag(tag=6) ProtEntityWeapon ,
        @Tag(tag=7) ProtEntityWeather ,
        @Tag(tag=8) ProtEntityScene ,
        @Tag(tag=9) ProtEntityTeam ,
        @Tag(tag=10) ProtEntityMassiveEntity ,
        @Tag(tag=11) ProtEntityMpLevel ,
        @Tag(tag=12) ProtEntityPlayTeamEntity ,
        @Tag(tag=13) ProtEntityEyePoint ,
        @Tag(tag=14) ProtEntityMax ;
}
