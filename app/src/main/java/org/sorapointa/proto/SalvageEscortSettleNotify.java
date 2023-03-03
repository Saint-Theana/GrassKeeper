package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SalvageEscortSettleInfo.*;
import org.sorapointa.proto.SalvageEscortSettleInfo;

public class SalvageEscortSettleNotify {
    @Tag(tag=14) public Integer galleryId = null;
    @Tag(tag=15) public SalvageEscortSettleInfo settleInfo = null;
}
