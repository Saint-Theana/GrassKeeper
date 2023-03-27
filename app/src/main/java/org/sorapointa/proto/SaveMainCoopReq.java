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

    public enum SaveMainCoopReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1996) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=4) public Integer id = null;
    @Tag(tag=15) public List<MapNormalVarMap> normalVarMap = new ArrayList<>();
    @Tag(tag=13) public Integer savePointId = null;
    @Tag(tag=10) public List<MapTempVarMap> tempVarMap = new ArrayList<>();
    @Tag(tag=1) public Integer selfConfidence = null;
}
