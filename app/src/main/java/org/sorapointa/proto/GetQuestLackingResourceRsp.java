package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetQuestLackingResourceRsp {
    public static class MapLackedNpcMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public static class MapLackedPlaceMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=4) public Integer questId = null;
    @Tag(tag=11,isSigned=true) public Integer retcode = null;
    @Tag(tag=8) public List<Integer> lackedNpcList = new ArrayList<>();
    @Tag(tag=5) public List<Integer> lackedPlaceList = new ArrayList<>();
    @Tag(tag=10) public List<MapLackedNpcMap> lackedNpcMap = new ArrayList<>();
    @Tag(tag=2) public List<MapLackedPlaceMap> lackedPlaceMap = new ArrayList<>();
}
