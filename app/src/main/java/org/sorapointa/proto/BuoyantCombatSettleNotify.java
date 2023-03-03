package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.BuoyantCombatSettleInfo.*;
import org.sorapointa.proto.BuoyantCombatSettleInfo;

public class BuoyantCombatSettleNotify {
    @Tag(tag=8) public Integer galleryId = null;
    @Tag(tag=11) public BuoyantCombatSettleInfo settleInfo = null;
}
