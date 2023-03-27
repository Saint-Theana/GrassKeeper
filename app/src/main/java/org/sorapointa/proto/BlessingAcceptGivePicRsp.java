package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BlessingAcceptGivePicRsp {
    public enum BlessingAcceptGivePicRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2069) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=12) public Integer picId = null;
    @Tag(tag=13) public Integer index = null;
    @Tag(tag=11) public Integer uid = null;
    @Tag(tag=14,isSigned=true) public Integer retcode = null;
}
