package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.DailyDungeonEntryInfo.*;
import org.sorapointa.proto.DailyDungeonEntryInfo;

public class GetDailyDungeonEntryInfoRsp {
    @Tag(tag=2) public List<DailyDungeonEntryInfo> dailyDungeonInfoList = new ArrayList<>();
    @Tag(tag=14,isSigned=true) public Integer retcode = null;
}
