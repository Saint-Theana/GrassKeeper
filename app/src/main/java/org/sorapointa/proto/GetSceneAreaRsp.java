package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CityInfo.*;
import org.sorapointa.proto.CityInfo;

public class GetSceneAreaRsp {
    public enum GetSceneAreaRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=225) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=11) public List<Integer> areaIdList = new ArrayList<>();
    @Tag(tag=6,isSigned=true) public Integer retcode = null;
    @Tag(tag=14) public List<CityInfo> cityInfoList = new ArrayList<>();
    @Tag(tag=2) public Integer sceneId = null;
}
