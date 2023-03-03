package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SeaLampTakePhaseRewardRsp {
    @Tag(tag=2) public Integer phaseId = null;
    @Tag(tag=6,isSigned=true) public Integer retcode = null;
}
