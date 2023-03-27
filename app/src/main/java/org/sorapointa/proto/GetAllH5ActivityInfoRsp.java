package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetAllH5ActivityInfoRsp {
    public enum GetAllH5ActivityInfoRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5688) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5) public Integer clientRedDotTimestamp = null;
    @Tag(tag=6) public List<H5ActivityInfo> h5ActivityInfoList = new ArrayList<>();
    @Tag(tag=14,isSigned=true) public Integer retcode = null;
}
