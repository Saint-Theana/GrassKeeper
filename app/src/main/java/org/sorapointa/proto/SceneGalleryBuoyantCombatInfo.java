package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SceneGalleryBuoyantCombatInfo {
    @Tag(tag=6) public Integer score = null;
    @Tag(tag=1) public Integer killSpecialMonsterCount = null;
    @Tag(tag=14) public Integer killMonsterCount = null;
}
