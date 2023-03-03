package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ChessEntranceDetailInfo.*;
import org.sorapointa.proto.ChessEntranceDetailInfo;

public class ChessMysteryInfo {
    public static class MapEntrancePointMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public static class MapDetailInfoMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public ChessEntranceDetailInfo value = null;
    }

    @Tag(tag=13) public List<MapEntrancePointMap> entrancePointMap = new ArrayList<>();
    @Tag(tag=3) public List<Integer> exitPointIdList = new ArrayList<>();
    @Tag(tag=5) public List<MapDetailInfoMap> detailInfoMap = new ArrayList<>();
}
