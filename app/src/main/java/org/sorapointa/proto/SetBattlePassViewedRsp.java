package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SetBattlePassViewedRsp {
    @Tag(tag=2) public Integer scheduleId = null;
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
}
