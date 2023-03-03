package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SalvageEscortGallerySettleInfo.*;
import org.sorapointa.proto.SalvageEscortGallerySettleInfo;

public class SalvageEscortSettleInfo {
    @Tag(tag=3) public SalvageEscortGallerySettleInfo settleInfo = null;
    @Tag(tag=2) public Boolean isNewRecord = null;
}
