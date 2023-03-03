package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SeaLampFlyLampRsp {
    @Tag(tag=9) public Integer itemNum = null;
    @Tag(tag=15) public Integer itemId = null;
    @Tag(tag=14,isSigned=true) public Integer retcode = null;
}
