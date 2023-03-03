package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MultistagePlayFinishStageRsp {
    @Tag(tag=11,isSigned=true) public Integer retcode = null;
    @Tag(tag=12) public Integer groupId = null;
    @Tag(tag=6) public Integer playIndex = null;
}
