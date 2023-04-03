package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CityInfo.*;
import org.sorapointa.proto.CityInfo;

public class LevelupCityRsp {
    public enum LevelupCityRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=267) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2,isSigned=true) public Integer retcode = null;
    @Tag(tag=15) public CityInfo cityInfo = null;
    @Tag(tag=12) public Integer areaId = null;
    @Tag(tag=3) public Integer sceneId = null;
}
