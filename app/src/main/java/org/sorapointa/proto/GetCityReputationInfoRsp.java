package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CityReputationInfo.*;
import org.sorapointa.proto.CityReputationInfo;

public class GetCityReputationInfoRsp {
    public enum GetCityReputationInfoRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2855) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10,isSigned=true) public Integer retcode = null;
    @Tag(tag=6) public Integer cityId = null;
    @Tag(tag=5) public CityReputationInfo cityReputationInfo = null;
}
