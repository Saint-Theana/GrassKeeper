package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BlessingGetAllRecvPicRecordListRsp {
    public enum BlessingGetAllRecvPicRecordListRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2118) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9) public List<BlessingRecvPicRecord> recvPicRecordList = new ArrayList<>();
    @Tag(tag=4,isSigned=true) public Integer retcode = null;
}
