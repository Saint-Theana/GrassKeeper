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

    public enum GetQuestLackingResourceRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=483) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=3) public List<MapLackedNpcMap> lackedNpcMap = new ArrayList<>();
    @Tag(tag=14,isSigned=true) public Integer retcode = null;
    @Tag(tag=9) public List<Integer> lackedPlaceList = new ArrayList<>();
    @Tag(tag=15) public List<Integer> lackedNpcList = new ArrayList<>();
    @Tag(tag=6) public Integer questId = null;
    @Tag(tag=1) public List<MapLackedPlaceMap> lackedPlaceMap = new ArrayList<>();
}
