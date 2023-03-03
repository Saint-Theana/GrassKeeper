package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CityReputationInfo.*;
import org.sorapointa.proto.CityReputationInfo;

public class GetCityReputationInfoRsp {
    @Tag(tag=1) public Integer cityId = null;
    @Tag(tag=4,isSigned=true) public Integer retcode = null;
    @Tag(tag=9) public CityReputationInfo cityReputationInfo = null;
}
