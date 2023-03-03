package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MapMarkPoint.*;
import org.sorapointa.proto.MapMarkPoint;

public class MarkMapRsp {
    @Tag(tag=8) public List<MapMarkPoint> markList = new ArrayList<>();
    @Tag(tag=11,isSigned=true) public Integer retcode = null;
}
