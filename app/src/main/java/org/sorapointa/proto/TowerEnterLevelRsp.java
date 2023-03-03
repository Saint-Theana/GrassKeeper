package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TowerEnterLevelRsp {
    @Tag(tag=10) public List<Integer> towerBuffIdList = new ArrayList<>();
    @Tag(tag=1,isSigned=true) public Integer retcode = null;
    @Tag(tag=14) public Integer levelIndex = null;
    @Tag(tag=5) public Integer floorId = null;
}
