package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.TowerFightRecordPair.*;
import org.sorapointa.proto.TowerFightRecordPair;

public class TowerMonthlyCombatRecord {
    @Tag(tag=14) public TowerFightRecordPair mostKillAvatarPair = null;
    @Tag(tag=8) public TowerFightRecordPair mostCastNormalSkillAvatarPair = null;
    @Tag(tag=6) public List<TowerFightRecordPair> mostRevealAvatarList = new ArrayList<>();
    @Tag(tag=4) public TowerFightRecordPair mostCastEnergySkillAvatarPair = null;
    @Tag(tag=12) public TowerFightRecordPair highestDpsAvatrPair = null;
    @Tag(tag=9) public TowerFightRecordPair mostTakeDamageAvatarPair = null;
}
