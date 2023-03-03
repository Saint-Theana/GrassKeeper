package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SalvagePreventStopReason.*;
import org.sorapointa.proto.SalvagePreventStopReason;

public class SalvagePreventGallerySettleInfo {
    @Tag(tag=8) public Integer timeRemain = null;
    @Tag(tag=7) public Integer reason = null;
    @Tag(tag=13) public Integer finalScore = null;
    @Tag(tag=15) public Integer monsterCount = null;
}
