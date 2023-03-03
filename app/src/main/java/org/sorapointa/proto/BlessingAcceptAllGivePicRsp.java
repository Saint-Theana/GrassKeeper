package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BlessingAcceptAllGivePicRsp {
    public static class MapAcceptPicNumMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=11,isSigned=true) public Integer retcode = null;
    @Tag(tag=14) public List<MapAcceptPicNumMap> acceptPicNumMap = new ArrayList<>();
    @Tag(tag=5) public List<Integer> acceptIndexList = new ArrayList<>();
}
