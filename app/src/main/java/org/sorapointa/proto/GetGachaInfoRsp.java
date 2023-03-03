package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GachaInfo.*;
import org.sorapointa.proto.GachaInfo;

public class GetGachaInfoRsp {
    @Tag(tag=6) public Boolean isUnderGeneralRestrict = null;
    @Tag(tag=9) public Integer gachaRandom = null;
    @Tag(tag=10,isSigned=true) public Integer retcode = null;
    @Tag(tag=2) public Boolean isUnderMinorsRestrict = null;
    @Tag(tag=5) public Integer dailyGachaTimes = null;
    @Tag(tag=13) public List<GachaInfo> gachaInfoList = new ArrayList<>();
}
