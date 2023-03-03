package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ActivityAcceptGiftResultInfo {
    public static class MapUnacceptGiftNumMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public static class MapAcceptGiftNumMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=3) public List<MapUnacceptGiftNumMap> unacceptGiftNumMap = new ArrayList<>();
    @Tag(tag=6) public Integer uid = null;
    @Tag(tag=13) public List<MapAcceptGiftNumMap> acceptGiftNumMap = new ArrayList<>();
}
