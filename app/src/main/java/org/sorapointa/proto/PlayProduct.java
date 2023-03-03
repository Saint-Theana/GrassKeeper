package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayProduct {
    @Tag(tag=1) public String productId = null;
    @Tag(tag=2) public String priceTier = null;
    @Tag(tag=3) public Integer scheduleId = null;
}
