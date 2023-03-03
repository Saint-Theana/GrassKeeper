package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetPlayerMpModeAvailabilityRsp {
    @Tag(tag=15,isSigned=true) public Integer mpRet = null;
    @Tag(tag=2,isSigned=true) public Integer retcode = null;
    @Tag(tag=8) public List<Integer> paramList = new ArrayList<>();
}
