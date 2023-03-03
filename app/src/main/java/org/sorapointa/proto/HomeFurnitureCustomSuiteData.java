package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class HomeFurnitureCustomSuiteData {
    @Tag(tag=11) public Integer guid = null;
    @Tag(tag=14) public Vector spawnPos = null;
    @Tag(tag=12,isSigned=true) public List<Integer> includedFurnitureIndexList = new ArrayList<>();
}
