package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AttackHitEffectResult {
    @Tag(tag=8,isFloat=true) public Float hitHaltTimeScale = null;
    @Tag(tag=12) public Integer originalHitEffLevel = null;
    @Tag(tag=15,isFloat=true) public Float airStrength = null;
    @Tag(tag=2) public Integer hitEffLevel = null;
    @Tag(tag=13,isFloat=true) public Float hitHaltTime = null;
    @Tag(tag=7,isFloat=true) public Float retreatStrength = null;
}
