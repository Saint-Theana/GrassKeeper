package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ShopMcoinProduct {
    @Tag(tag=1) public String productId = null;
    @Tag(tag=2) public String priceTier = null;
    @Tag(tag=3) public Integer mcoinBase = null;
    @Tag(tag=4) public Integer mcoinNonFirst = null;
    @Tag(tag=5) public Integer mcoinFirst = null;
    @Tag(tag=6) public Integer boughtNum = null;
    @Tag(tag=7) public Boolean isAudit = null;
}
