package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetAuthSalesmanInfoRsp {
    @Tag(tag=5) public Integer dayRewardId = null;
    @Tag(tag=6,isSigned=true) public Integer retcode = null;
    @Tag(tag=11) public Integer scheduleId = null;
}
