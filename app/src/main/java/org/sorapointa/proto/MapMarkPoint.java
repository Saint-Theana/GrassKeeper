package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MapMarkFromType.*;
import org.sorapointa.proto.MapMarkFromType;
import org.sorapointa.proto.MapMarkPointType.*;
import org.sorapointa.proto.MapMarkPointType;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class MapMarkPoint {
    @Tag(tag=1) public Integer sceneId = null;
    @Tag(tag=2) public String name = null;
    @Tag(tag=3) public Vector pos = null;
    @Tag(tag=4) public Integer pointType = null;
    @Tag(tag=5) public Integer monsterId = null;
    @Tag(tag=6) public Integer fromType = null;
    @Tag(tag=7) public Integer questId = null;
}
