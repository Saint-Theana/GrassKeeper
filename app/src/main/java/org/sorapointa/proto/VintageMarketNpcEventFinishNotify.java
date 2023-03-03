package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class VintageMarketNpcEventFinishNotify {
    @Tag(tag=15) public List<Integer> unlockStrategyList = new ArrayList<>();
    @Tag(tag=12) public Integer coinC = null;
    @Tag(tag=4) public Integer coinA = null;
}
