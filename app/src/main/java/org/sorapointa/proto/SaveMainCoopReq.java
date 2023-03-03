package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SaveMainCoopReq {
    public static class MapNormalVarMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2,isSigned=true) public Integer value = null;
    }

    public static class MapTempVarMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2,isSigned=true) public Integer value = null;
    }

    @Tag(tag=15) public List<MapNormalVarMap> normalVarMap = new ArrayList<>();
    @Tag(tag=2) public Integer selfConfidence = null;
    @Tag(tag=1) public Integer savePointId = null;
    @Tag(tag=8) public List<MapTempVarMap> tempVarMap = new ArrayList<>();
    @Tag(tag=3) public Integer id = null;
}
