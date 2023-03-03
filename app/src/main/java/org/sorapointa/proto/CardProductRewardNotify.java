package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CardProductRewardNotify {
    @Tag(tag=6) public Integer hcoin = null;
    @Tag(tag=14) public String productId = null;
    @Tag(tag=1) public Integer remainDays = null;
}
