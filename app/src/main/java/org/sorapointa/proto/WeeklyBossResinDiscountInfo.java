package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WeeklyBossResinDiscountInfo {
    @Tag(tag=1) public Integer discountNum = null;
    @Tag(tag=2) public Integer discountNumLimit = null;
    @Tag(tag=3) public Integer resinCost = null;
    @Tag(tag=4) public Integer originalResinCost = null;
}
