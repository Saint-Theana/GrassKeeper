package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BargainOfferPriceReq {
    @Tag(tag=4) public Integer bargainId = null;
    @Tag(tag=6) public Integer price = null;
}
