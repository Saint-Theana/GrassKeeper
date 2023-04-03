package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FallSettleInfo.*;
import org.sorapointa.proto.FallSettleInfo;

public class FleurFairFallSettleInfo {
    @Tag(tag=11) public FallSettleInfo settleInfo = null;
    @Tag(tag=14) public Boolean isNewRecord = null;
}
