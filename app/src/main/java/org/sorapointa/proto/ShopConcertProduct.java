package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ShopConcertProduct {
    @Tag(tag=1) public String productId = null;
    @Tag(tag=2) public String priceTier = null;
    @Tag(tag=3) public Integer obtainCount = null;
    @Tag(tag=4) public Integer obtainLimit = null;
    @Tag(tag=5) public Integer beginTime = null;
    @Tag(tag=6) public Integer endTime = null;
    @Tag(tag=7) public Integer buyTimes = null;
}
