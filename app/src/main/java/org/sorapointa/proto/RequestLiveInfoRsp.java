package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RequestLiveInfoRsp {
    @Tag(tag=14) public String spareLiveUrl = null;
    @Tag(tag=9,isSigned=true) public Integer retcode = null;
    @Tag(tag=12) public String liveUrl = null;
    @Tag(tag=2) public Integer liveId = null;
}
