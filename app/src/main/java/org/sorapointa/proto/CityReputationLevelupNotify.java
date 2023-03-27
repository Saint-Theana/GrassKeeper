package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CityReputationLevelupNotify {
    public enum CityReputationLevelupNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2820) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10) public Integer cityId = null;
    @Tag(tag=11) public Integer level = null;
}
