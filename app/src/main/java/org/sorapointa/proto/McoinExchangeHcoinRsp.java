package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class McoinExchangeHcoinRsp {
    @Tag(tag=8) public Integer mcoinCost = null;
    @Tag(tag=7) public Integer hcoin = null;
    @Tag(tag=4,isSigned=true) public Integer retcode = null;
}
