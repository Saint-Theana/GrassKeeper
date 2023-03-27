package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SalvagePreventGallerySettleInfo {
    @Tag(tag=10) public Integer timeRemain = null;
    @Tag(tag=6) public Integer finalScore = null;
    @Tag(tag=2) public Integer reason = null;
    @Tag(tag=3) public Integer monsterCount = null;
}
