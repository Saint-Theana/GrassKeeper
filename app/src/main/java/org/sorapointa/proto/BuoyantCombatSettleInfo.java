package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.BuoyantCombatGallerySettleInfo.*;
import org.sorapointa.proto.BuoyantCombatGallerySettleInfo;

public class BuoyantCombatSettleInfo {
    @Tag(tag=1) public Boolean isNewRecord = null;
    @Tag(tag=3) public BuoyantCombatGallerySettleInfo settleInfo = null;
}
