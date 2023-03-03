package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class HomeFurnitureSuiteData {
    @Tag(tag=10) public Boolean isAllowSummon = null;
    @Tag(tag=6) public Integer suiteId = null;
    @Tag(tag=8) public Vector spawnPos = null;
    @Tag(tag=13) public Integer guid = null;
    @Tag(tag=1,isSigned=true) public List<Integer> includedFurnitureIndexList = new ArrayList<>();
}
