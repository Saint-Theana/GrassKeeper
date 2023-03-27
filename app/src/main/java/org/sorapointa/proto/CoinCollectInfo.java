package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CoinCollectInfo {
    @Tag(tag=11) public Integer coinTotalNum = null;
    @Tag(tag=9) public Integer coinCollectNum = null;
}
