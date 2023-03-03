package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TakeInvestigationTargetRewardRsp {
    @Tag(tag=1,isSigned=true) public Integer retcode = null;
    @Tag(tag=2) public Integer questId = null;
}
