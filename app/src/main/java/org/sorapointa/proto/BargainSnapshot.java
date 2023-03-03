package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BargainSnapshot {
    @Tag(tag=3) public Integer expectedPrice = null;
    @Tag(tag=14,isSigned=true) public Integer curMood = null;
    @Tag(tag=2) public Integer priceLowLimit = null;
    @Tag(tag=5) public Integer bargainId = null;
}
