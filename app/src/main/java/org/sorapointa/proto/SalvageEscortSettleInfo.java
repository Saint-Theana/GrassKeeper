package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SalvageEscortSettleInfo {
    @Tag(tag=8) public SalvageEscortGallerySettleInfo settleInfo = null;
    @Tag(tag=9) public Boolean isNewRecord = null;
}
