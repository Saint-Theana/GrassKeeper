package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BlessingAcceptAllGivePicRsp {
    public static class MapAcceptPicNumMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public enum BlessingAcceptAllGivePicRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2048) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public List<MapAcceptPicNumMap> acceptPicNumMap = new ArrayList<>();
    @Tag(tag=3) public List<Integer> acceptIndexList = new ArrayList<>();
    @Tag(tag=11,isSigned=true) public Integer retcode = null;
}
