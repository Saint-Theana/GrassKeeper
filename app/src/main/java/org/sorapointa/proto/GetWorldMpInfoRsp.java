package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetWorldMpInfoRsp {
    @Tag(tag=12,isSigned=true) public Integer retcode = null;
    @Tag(tag=1) public Boolean isInMpMode = null;
    @Tag(tag=9) public Integer quitMpValidTime = null;
}
