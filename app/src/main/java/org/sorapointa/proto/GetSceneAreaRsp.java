package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CityInfo.*;
import org.sorapointa.proto.CityInfo;

public class GetSceneAreaRsp {
    @Tag(tag=7,isSigned=true) public Integer retcode = null;
    @Tag(tag=13) public List<CityInfo> cityInfoList = new ArrayList<>();
    @Tag(tag=15) public Integer sceneId = null;
    @Tag(tag=9) public List<Integer> areaIdList = new ArrayList<>();
}
