package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MiracleRingDataNotify {
    @Tag(tag=8) public Boolean isGadgetCreated = null;
    @Tag(tag=14) public Integer lastTakeRewardTime = null;
    @Tag(tag=12) public Integer gadgetEntityId = null;
    @Tag(tag=10) public Integer lastDeliverItemTime = null;
    @Tag(tag=7) public Integer miracleRingCd = null;
}
