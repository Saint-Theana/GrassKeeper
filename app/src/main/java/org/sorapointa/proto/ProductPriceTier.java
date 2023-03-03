package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ProductPriceTier {
    @Tag(tag=6) public String productId = null;
    @Tag(tag=12) public String priceTier = null;
}
