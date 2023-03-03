package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MapMarkPoint.*;
import org.sorapointa.proto.MapMarkPoint;

public class AllMarkPointNotify {
    @Tag(tag=7) public List<MapMarkPoint> markList = new ArrayList<>();
}
