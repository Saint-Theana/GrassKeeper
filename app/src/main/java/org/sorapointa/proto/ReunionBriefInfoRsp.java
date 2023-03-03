package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ReunionBriefInfo.*;
import org.sorapointa.proto.ReunionBriefInfo;

public class ReunionBriefInfoRsp {
    @Tag(tag=13) public Boolean isActivate = null;
    @Tag(tag=14,isSigned=true) public Integer retcode = null;
    @Tag(tag=5) public ReunionBriefInfo reunionBriefInfo = null;
}
