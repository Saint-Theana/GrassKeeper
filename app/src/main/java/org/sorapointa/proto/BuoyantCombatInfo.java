package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BuoyantCombatInfo {
    @Tag(tag=3) public Integer killMonsterCount = null;
    @Tag(tag=15) public Integer killSpecialMonsterCount = null;
    @Tag(tag=12) public Integer score = null;
}
