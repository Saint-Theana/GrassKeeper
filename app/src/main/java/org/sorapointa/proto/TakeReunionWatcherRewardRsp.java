package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TakeReunionWatcherRewardRsp {
    @Tag(tag=15) public Integer missionId = null;
    @Tag(tag=9) public Integer watcherId = null;
    @Tag(tag=10,isSigned=true) public Integer retcode = null;
}
