package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TowerEnterLevelRsp {
    public enum TowerEnterLevelRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2429) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15) public Integer levelIndex = null;
    @Tag(tag=6) public List<Integer> towerBuffIdList = new ArrayList<>();
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
    @Tag(tag=11) public Integer floorId = null;
}
