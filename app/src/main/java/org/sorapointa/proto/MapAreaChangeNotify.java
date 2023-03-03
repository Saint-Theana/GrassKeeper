package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MapAreaInfo.*;
import org.sorapointa.proto.MapAreaInfo;

public class MapAreaChangeNotify {
    @Tag(tag=3) public List<MapAreaInfo> mapAreaInfoList = new ArrayList<>();
}
