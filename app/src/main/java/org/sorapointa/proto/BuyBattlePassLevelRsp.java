package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BuyBattlePassLevelRsp {
    @Tag(tag=5,isSigned=true) public Integer retcode = null;
    @Tag(tag=13) public Integer buyLevel = null;
}
