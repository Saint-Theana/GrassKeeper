package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MainCoop {
    public static class MapNormalVarMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2,isSigned=true) public Integer value = null;
    }

    public static class MapTempVarMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2,isSigned=true) public Integer value = null;
    }

    public static class MapSeenEndingMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=3) public Integer selfConfidence = null;
    @Tag(tag=6) public List<Integer> savePointIdList = new ArrayList<>();
    @Tag(tag=15) public Integer id = null;
    @Tag(tag=12) public List<MapNormalVarMap> normalVarMap = new ArrayList<>();
    @Tag(tag=8) public Integer status = null;
    @Tag(tag=2) public List<MapTempVarMap> tempVarMap = new ArrayList<>();
    @Tag(tag=4) public List<MapSeenEndingMap> seenEndingMap = new ArrayList<>();
}
