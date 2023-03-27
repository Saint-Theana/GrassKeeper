package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AttackResult {
    @Tag(tag=6) public Integer endureBreak = null;
    @Tag(tag=1940) public Integer bulletFlyTimeMs = null;
    @Tag(tag=12,isFloat=true) public Float damage = null;
    @Tag(tag=9) public Boolean isCrit = null;
    @Tag(tag=5) public AttackHitEffectResult hitEffResult = null;
    @Tag(tag=1333,isFloat=true) public Float elementDurabilityAttenuation = null;
    @Tag(tag=198,isFloat=true) public Float damageShield = null;
    @Tag(tag=1698) public Boolean useGadgetDamageAction = null;
    @Tag(tag=1) public Integer elementType = null;
    @Tag(tag=346) public Integer targetType = null;
    @Tag(tag=531) public Boolean isResistText = null;
    @Tag(tag=1576) public Integer criticalRand = null;
    @Tag(tag=2) public AbilityIdentifier abilityIdentifier = null;
    @Tag(tag=14) public HitCollision hitCollision = null;
    @Tag(tag=1829) public Integer attackTimestampMs = null;
    @Tag(tag=4) public Integer attackerId = null;
    @Tag(tag=11) public String animEventId = null;
    @Tag(tag=15,isSigned=true) public Integer hitRetreatAngleCompat = null;
    @Tag(tag=55) public Integer gadgetDamageActionIdx = null;
    @Tag(tag=13) public Integer defenseId = null;
    @Tag(tag=555) public Boolean muteElementHurt = null;
    @Tag(tag=1593) public Integer attackCount = null;
    @Tag(tag=8) public Vector resolvedDir = null;
    @Tag(tag=7) public Integer hitPosType = null;
    @Tag(tag=2009) public Integer hashedAnimEventId = null;
    @Tag(tag=1569) public Integer addhurtReactionType = null;
    @Tag(tag=1169,isFloat=true) public Float endureDelta = null;
    @Tag(tag=701) public Integer createCountSyncToServer = null;
    @Tag(tag=1858,isFloat=true) public Float elementAmplifyRate = null;
    @Tag(tag=888) public Integer amplifyReactionType = null;
}
