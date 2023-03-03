package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GalleryStopReason.*;
import org.sorapointa.proto.GalleryStopReason;

public class LuminanceStoneChallengeGallerySettleInfo {
    @Tag(tag=12) public Integer killMonsterCount = null;
    @Tag(tag=8) public Integer killSpecialMonsterCount = null;
    @Tag(tag=10) public Integer cleanMudCount = null;
    @Tag(tag=2) public Integer galleryId = null;
    @Tag(tag=11) public Integer reason = null;
    @Tag(tag=13) public Integer finalScore = null;
}
