package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.DailyDungeonEntryInfo.*;
import org.sorapointa.proto.DailyDungeonEntryInfo;

public class GetDailyDungeonEntryInfoRsp {
    public enum GetDailyDungeonEntryInfoRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=964) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=3,isSigned=true) public Integer retcode = null;
    @Tag(tag=8) public List<DailyDungeonEntryInfo> dailyDungeonInfoList = new ArrayList<>();
}
