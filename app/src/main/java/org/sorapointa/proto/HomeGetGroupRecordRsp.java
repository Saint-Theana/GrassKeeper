package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeGetGroupRecordRsp {
    public enum HomeGetGroupRecordRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4691) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=12) public Integer recordType = null;
    @Tag(tag=7,isSigned=true) public Integer retcode = null;
    @Tag(tag=13) public HomeGroupRecord groupRecord = null;
}
