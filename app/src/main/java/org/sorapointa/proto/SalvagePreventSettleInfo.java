package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SalvagePreventGallerySettleInfo.*;
import org.sorapointa.proto.SalvagePreventGallerySettleInfo;

public class SalvagePreventSettleInfo {
    @Tag(tag=8) public Boolean isNewRecord = null;
    @Tag(tag=14) public SalvagePreventGallerySettleInfo settleInfo = null;
}
