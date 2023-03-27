package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GroupSuiteNotify {
    public static class MapGroupMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public enum GroupSuiteNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3115) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=12) public List<MapGroupMap> groupMap = new ArrayList<>();
}
