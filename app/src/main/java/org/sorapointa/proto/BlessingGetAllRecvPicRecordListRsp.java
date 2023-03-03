package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.BlessingRecvPicRecord.*;
import org.sorapointa.proto.BlessingRecvPicRecord;

public class BlessingGetAllRecvPicRecordListRsp {
    @Tag(tag=15) public List<BlessingRecvPicRecord> recvPicRecordList = new ArrayList<>();
    @Tag(tag=9,isSigned=true) public Integer retcode = null;
}
