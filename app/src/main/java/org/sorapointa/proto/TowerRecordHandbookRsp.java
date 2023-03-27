package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TowerRecordHandbookRsp {
    public enum TowerRecordHandbookRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2450) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=8) public List<TowerMonthlyDetail> monthlyDetailList = new ArrayList<>();
    @Tag(tag=12,isSigned=true) public Integer retcode = null;
}
