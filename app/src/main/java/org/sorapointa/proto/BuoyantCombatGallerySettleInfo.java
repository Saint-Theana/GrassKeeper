package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BuoyantCombatGallerySettleInfo {
    @Tag(tag=12) public Integer galleryLevel = null;
    @Tag(tag=15) public Integer finalScore = null;
    @Tag(tag=9) public Integer killMonsterCount = null;
    @Tag(tag=1) public Integer killTargetCount = null;
    @Tag(tag=4) public Integer killSpecialMonsterCount = null;
    @Tag(tag=2) public Integer galleryId = null;
    @Tag(tag=11) public Integer galleryMultiple = null;
}
