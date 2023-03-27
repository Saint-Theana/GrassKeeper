package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BargainSnapshot {
    @Tag(tag=10) public Integer priceLowLimit = null;
    @Tag(tag=7) public Integer bargainId = null;
    @Tag(tag=13,isSigned=true) public Integer curMood = null;
    @Tag(tag=6) public Integer expectedPrice = null;
}
