package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ActivityAcceptGiftResultInfo {
    public static class MapAcceptGiftNumMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public static class MapUnacceptGiftNumMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=14) public List<MapAcceptGiftNumMap> acceptGiftNumMap = new ArrayList<>();
    @Tag(tag=11) public Integer uid = null;
    @Tag(tag=4) public List<MapUnacceptGiftNumMap> unacceptGiftNumMap = new ArrayList<>();
}
