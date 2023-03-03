package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DungeonSlipRevivePointActivateRsp {
    @Tag(tag=14) public Integer slipRevivePointId = null;
    @Tag(tag=4,isSigned=true) public Integer retcode = null;
}
