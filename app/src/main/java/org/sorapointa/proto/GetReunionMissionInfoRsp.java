package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ReunionMissionInfo.*;
import org.sorapointa.proto.ReunionMissionInfo;

public class GetReunionMissionInfoRsp {
    @Tag(tag=9,isSigned=true) public Integer retcode = null;
    @Tag(tag=14) public ReunionMissionInfo missionInfo = null;
}
