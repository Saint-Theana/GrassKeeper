package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeExchangeWoodRsp {
    @Tag(tag=13,isSigned=true) public Integer retcode = null;
    @Tag(tag=1) public Integer woodId = null;
    @Tag(tag=3) public Integer woodCount = null;
    @Tag(tag=2) public Integer exchangedCount = null;
}
