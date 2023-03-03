package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ProductPriceTier.*;
import org.sorapointa.proto.ProductPriceTier;

public class PlayerRechargeDataNotify {
    @Tag(tag=12) public Integer cardProductRemainDays = null;
    @Tag(tag=11) public List<ProductPriceTier> productPriceTierList = new ArrayList<>();
}
