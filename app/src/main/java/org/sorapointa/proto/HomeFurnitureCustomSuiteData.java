package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeFurnitureCustomSuiteData {
    @Tag(tag=10) public Integer guid = null;
    @Tag(tag=5,isSigned=true) public List<Integer> includedFurnitureIndexList = new ArrayList<>();
    @Tag(tag=6) public Vector spawnPos = null;
}
