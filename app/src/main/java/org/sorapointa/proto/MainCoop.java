package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MainCoop {
    public static class MapSeenEndingMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public static class MapNormalVarMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2,isSigned=true) public Integer value = null;
    }

    public static class MapTempVarMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2,isSigned=true) public Integer value = null;
    }

    public enum Status {
        @Tag(tag=0) STATUS_INVALID ,
        @Tag(tag=1) STATUS_RUNNING ,
        @Tag(tag=2) STATUS_FINISHED ;
    }

    @Tag(tag=13) public List<MapSeenEndingMap> seenEndingMap = new ArrayList<>();
    @Tag(tag=4) public List<MapNormalVarMap> normalVarMap = new ArrayList<>();
    @Tag(tag=5) public Integer selfConfidence = null;
    @Tag(tag=1) public List<Integer> savePointIdList = new ArrayList<>();
    @Tag(tag=6) public Status status = null;
    @Tag(tag=11) public List<MapTempVarMap> tempVarMap = new ArrayList<>();
    @Tag(tag=9) public Integer id = null;
}
