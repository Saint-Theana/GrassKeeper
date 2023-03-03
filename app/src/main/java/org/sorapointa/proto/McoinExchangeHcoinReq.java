package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class McoinExchangeHcoinReq {
    @Tag(tag=5) public Integer hcoin = null;
    @Tag(tag=1) public Integer mcoinCost = null;
}
