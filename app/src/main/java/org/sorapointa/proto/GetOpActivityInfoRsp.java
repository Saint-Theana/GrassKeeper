package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.OpActivityInfo.*;
import org.sorapointa.proto.OpActivityInfo;

public class GetOpActivityInfoRsp {
    public enum GetOpActivityInfoRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5155) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=11) public List<OpActivityInfo> opActivityInfoList = new ArrayList<>();
    @Tag(tag=14,isSigned=true) public Integer retcode = null;
}
