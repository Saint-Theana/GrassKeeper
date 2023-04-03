package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.TowerFightRecordPair.*;
import org.sorapointa.proto.TowerFightRecordPair;

public class TowerMonthlyCombatRecord {
    @Tag(tag=10) public TowerFightRecordPair highestDpsAvatrPair = null;
    @Tag(tag=8) public TowerFightRecordPair mostTakeDamageAvatarPair = null;
    @Tag(tag=1) public TowerFightRecordPair mostCastEnergySkillAvatarPair = null;
    @Tag(tag=11) public TowerFightRecordPair mostCastNormalSkillAvatarPair = null;
    @Tag(tag=4) public TowerFightRecordPair mostKillAvatarPair = null;
    @Tag(tag=7) public List<TowerFightRecordPair> mostRevealAvatarList = new ArrayList<>();
}
