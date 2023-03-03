package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CityReputationSimpleInfo.*;
import org.sorapointa.proto.CityReputationSimpleInfo;

public class CityReputationDataNotify {
    @Tag(tag=7) public List<CityReputationSimpleInfo> simpleInfoList = new ArrayList<>();
}
