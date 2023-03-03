package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ShareCDInfo.*;
import org.sorapointa.proto.ShareCDInfo;

public class AllShareCDDataNotify {
    public static class MapShareCdInfoMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public ShareCDInfo value = null;
    }

    @Tag(tag=2) public List<MapShareCdInfoMap> shareCdInfoMap = new ArrayList<>();
}
