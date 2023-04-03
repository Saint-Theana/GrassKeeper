package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;
import org.sorapointa.proto.LunaRiteHintPointType.*;
import org.sorapointa.proto.LunaRiteHintPointType;

public class LunaRiteHintPoint {
    @Tag(tag=4) public Integer index = null;
    @Tag(tag=11) public Vector pos = null;
    @Tag(tag=2) public Integer areaId = null;
    @Tag(tag=15) public Integer type = null;
}
