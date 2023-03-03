package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MiracleRingDropResultNotify {
    @Tag(tag=5,isSigned=true) public Integer lastTakeRewardTime = null;
    @Tag(tag=9,isSigned=true) public Integer dropResult = null;
}
