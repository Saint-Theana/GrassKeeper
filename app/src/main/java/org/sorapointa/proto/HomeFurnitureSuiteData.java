package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeFurnitureSuiteData {
    @Tag(tag=7,isSigned=true) public List<Integer> includedFurnitureIndexList = new ArrayList<>();
    @Tag(tag=12) public Integer guid = null;
    @Tag(tag=15) public Integer suiteId = null;
    @Tag(tag=14) public Boolean isAllowSummon = null;
    @Tag(tag=10) public Vector spawnPos = null;
}
