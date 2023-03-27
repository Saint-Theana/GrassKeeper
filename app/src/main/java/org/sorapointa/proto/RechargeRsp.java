package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RechargeRsp {
    public enum RechargeRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4145) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=8,isSigned=true) public Integer retcode = null;
    @Tag(tag=11) public String productId = null;
    @Tag(tag=5) public Boolean isShowMinorsHint = null;
}
