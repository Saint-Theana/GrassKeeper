package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SalvagePreventSettleInfo.*;
import org.sorapointa.proto.SalvagePreventSettleInfo;

public class SalvagePreventSettleNotify {
    @Tag(tag=13) public Integer galleryId = null;
    @Tag(tag=12) public SalvagePreventSettleInfo settleInfo = null;
}
